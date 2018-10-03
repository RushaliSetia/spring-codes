package com.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionProvider {

	static DataSource dataSource;
	static Connection connection;

	public static DataSource getDataSource() {
		return dataSource;
	}

	public static void setDataSource(DataSource dataSource) {
		ConnectionProvider.dataSource = dataSource;
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ConnectionProvider.connection = connection;
	}

	@Override
	public String toString() {
		return "ConnectionProvider [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static Connection getConn() throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		dataSource = (DataSource) applicationContext.getBean("dataSource");
		connection = dataSource.getConnection();
		System.out.println("Connection created");
		return connection;
	}
}
