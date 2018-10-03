package com.infy.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connector {
	DataSource dataSource;
	Connection connection;

	public Connector() {
		super();
	}

	public Connector(DataSource dataSource, Connection connection) {
		super();
		this.dataSource = dataSource;
		this.connection = connection;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "Connector [dataSource=" + dataSource + ", connection=" + connection + "]";
	}

	public Connection getConn() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/spring.xml");
		dataSource = applicationContext.getBean("dataSource", DataSource.class);
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
