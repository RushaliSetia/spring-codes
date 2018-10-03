package com.infy.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.infy.model.Person;
import com.infy.utility.Connector;
import com.mysql.jdbc.PreparedStatement;

public class PersonDAO {

	public void insertCustomer(Person person) {
		Connection connection;
		connection = new Connector().getConn();
		String query = "INSERT INTO person1 VALUES(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, person.getPid());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getGender());
			preparedStatement.setInt(4, person.getAge());
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person ID to be Updated:");
		int personID = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter Person Name:");
		String name = scanner.nextLine();
		Connection connection;
		connection = new Connector().getConn();
		String query = "UPDATE person1 SET name=? where pid=?";
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, personID);
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

	public void readAllCustomer() {
		Connection connection;
		connection = new Connector().getConn();
		try {
			String query = "SELECT * FROM person1";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("Person Details:");
			while (resultSet.next()) {
				System.out.println();
				System.out.println("ID:" + resultSet.getInt(1));
				System.out.println("Name:" + resultSet.getString(2));
				System.out.println("Age:" + resultSet.getString(3));
				System.out.println("Gender:" + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomerById() {
		Scanner scanner = new Scanner(System.in);
		int customerID = Integer.parseInt(scanner.nextLine());
		Connection connection;
		connection = new Connector().getConn();
		String query = "DELETE FROM person1 WHERE pID=?";
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
