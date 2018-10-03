package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.sql.DataSource;

import com.bean.TicketDetails;

public class TicketDAO {

	private DataSource dataSource;
	private Connection con;

	public TicketDAO() {
		System.out.println("--------->>" + getClass());
	}

	public TicketDAO(DataSource dataSource, Connection con) {
		super();
		try {
			this.dataSource = dataSource;
			this.con = con;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	/*
	 * login() method is used to validate the user by getting username and
	 * password from admin_login table and then print details of all the trains
	 */
	public void login(String unm, String pwd) {
		TicketDAO ticketDaoObject = new TicketDAO();
		try {
			con = dataSource.getConnection();
			String query = "SELECT * FROM Admin_login WHERE unm=? AND pwd=?";
			PreparedStatement ps = con.prepareStatement(query);
			java.sql.ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ticketDaoObject.showTrains();
				System.out.println("No more train details are available");
			} // end of while
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of login() method

	/* showTrains() method is used to display all the train details */
	public void showTrains() {
		try {
			con = dataSource.getConnection();
			String query = "SELECT * FROM Ticket_Details";
			PreparedStatement ps = con.prepareStatement(query);
			java.sql.ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// loop to get values from the data.
				System.out.println("-----------ticket details are as follows----------");
				System.out.println("ticket id:" + rs.getInt(1));
				System.out.println("class:" + rs.getString(2));
				System.out.println("source:" + rs.getString(3));
				System.out.println("destination:" + rs.getString(4));
				System.out.println("number of pessangers:" + rs.getInt(5));
				System.out.println("total amount:" + rs.getDouble(6));
				System.out.println("ticket number:" + rs.getInt(7));
				System.out.println("--------------------------------------------------");
			} // end while
		} // end try
		catch (Exception e) {
			e.printStackTrace();
		} // end catch
	}// end of showTrains() method.

	/* bookTicket() method will book the ticket */
	public TicketDetails bookTicket(int trainno) {
		int fare = 0;
		TicketDetails ticketDetails = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your train class in which you want to travel(SL/AC):");
		String trainClass = sc.nextLine();
		System.out.println("enter the number of passengers:");
		int noOfPassengers = Integer.parseInt(sc.nextLine());
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM Ticket_Details WHERE tNo=?");
			ps.setInt(1, trainno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ticketDetails = new TicketDetails(trainno, rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getDouble(6), rs.getInt(7));
			} // end of while
			if (trainClass.equalsIgnoreCase("AC")) {
				fare = fare + 200;

			}
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
		return ticketDetails;
	}// end of bookTicket() method

	/* cancelTicket() method is used to remove the booked ticket */
	public void cancelTicket(int ticketno) {
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM Ticket_Details WHERE tNo=?");
			int i = ps.executeUpdate();
			if (i != 0) {
				System.out.println("ticket details deleted......");
			} // end of if

		} // end try
		catch (Exception e) {
			e.printStackTrace();
		} // end catch
	}// end cancelTicket()
}// end of class
