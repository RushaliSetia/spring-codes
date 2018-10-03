package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.collection.EmployeeBean;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("xml/spring.xml");
		EmployeeBean employeeBeanObject=applicationContext.getBean("employeeBean", EmployeeBean.class);
		System.out.println(employeeBeanObject);

	}

}
