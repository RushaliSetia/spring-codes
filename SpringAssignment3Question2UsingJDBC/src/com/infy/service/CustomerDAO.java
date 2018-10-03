package com.infy.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.infy.model.Customer;
import com.infy.utility.Connector;
import com.mysql.jdbc.PreparedStatement;

public class CustomerDAO {

	public void insertCustomer(Customer customer) {
		Connection connection;
		connection = new Connector().getConn();
		String query = "INSERT INTO CUST_DETAIL VALUES(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, customer.getCid());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setInt(3, customer.getAge());
			preparedStatement.setInt(4, customer.getPamount());
			int result = preparedStatement.executeUpdate();
			if (result > 0)
				System.out.println("Inserted");
			else
				System.out.println("Not Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateCustomer() {
		System.out.println("Enter Customer ID to be Updated:");
		Scanner scanner = new Scanner(System.in);
		int customerID = Integer.parseInt(scanner.nextLine());
		Connection connection;
		connection = new Connector().getConn();
		String query = "UPDATE CUST_DETAIL SET cid=? where cid=?";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, customerID);
			preparedStatement.setInt(2, customerID);
			int result = preparedStatement.executeUpdate();
			if (result > 0)
				System.out.println("Updated");
			else
				System.out.println("Not Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

	public void displayAllCustomer() {
		Connection connection;
		connection = new Connector().getConn();
		try {
			String query = "SELECT * FROM CUST_DETAIL";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("Customer Details:");
			while (resultSet.next()) {
				System.out.println();
				System.out.println("ID:" + resultSet.getInt(1));
				System.out.println("Name:" + resultSet.getString(2));
				System.out.println("Age:" + resultSet.getInt(3));
				System.out.println("Purchase Amount:" + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayCustomerByID() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer ID:");
		int customerID = Integer.parseInt(scanner.nextLine());
		Connection connection;
		connection = new Connector().getConn();
		String query = "SELECT * FROM CUST_DETAIL WHERE CID=?";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, customerID);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(3));
				System.out.println(resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

	public void displayCustomerByPurchaseAmount() {
		Connection connection;
		connection = new Connector().getConn();
		try {
			String query = "SELECT * FROM CUST_DETAIL WHERE PAMOUNT>50000";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("Customer Details whose Purchase Amount is greater than 50000:");
			while (resultSet.next()) {
				System.out.println();
				System.out.println("ID:" + resultSet.getInt(1));
				System.out.println("Name:" + resultSet.getString(2));
				System.out.println("Age:" + resultSet.getInt(3));
				System.out.println("Purchase Amount:" + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayCustomerByAge() {
		Connection connection;
		connection = new Connector().getConn();
		try {
			String query = "SELECT * FROM CUST_DETAIL WHERE AGE BETWEEN 30 AND 50";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("Customer Details whose age is between 30 & 50:");
			while (resultSet.next()) {
				System.out.println();
				System.out.println("ID:" + resultSet.getInt(1));
				System.out.println("Name:" + resultSet.getString(2));
				System.out.println("Age:" + resultSet.getInt(3));
				System.out.println("Purchase Amount:" + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomerById() {
		System.out.println("Enter the ID:");
		Scanner scanner = new Scanner(System.in);
		int customerID = Integer.parseInt(scanner.nextLine());
		Connection connection;
		connection = new Connector().getConn();
		String query = "DELETE FROM CUST_DETAIL WHERE CID=?";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, customerID);
			int result = preparedStatement.executeUpdate();
			if (result > 0)
				System.out.println("Deleted");
			else
				System.out.println("Not Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
