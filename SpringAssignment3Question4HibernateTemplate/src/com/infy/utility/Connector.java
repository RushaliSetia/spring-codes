package com.infy.utility;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connector {

	public Connection getConn() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/spring.xml");
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
