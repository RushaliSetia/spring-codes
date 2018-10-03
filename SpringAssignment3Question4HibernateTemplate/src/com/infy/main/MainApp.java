package com.infy.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.model.Person;
import com.infy.service.PersonDAO;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/spring.xml");
		Person person1 = applicationContext.getBean("person1", Person.class);
		Person person2 = applicationContext.getBean("person2", Person.class);
		Person person3 = applicationContext.getBean("person3", Person.class);
		Person person4 = applicationContext.getBean("person4", Person.class);
		PersonDAO personDao = new PersonDAO();
		while (true) {
			System.out.println("-----MENU-----");
			System.out.println("1.Insert");
			System.out.println("2.Read");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.print("Enter the choice:");
			choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				personDao.insertCustomer(person1);
				personDao.insertCustomer(person2);
				personDao.insertCustomer(person3);
				personDao.insertCustomer(person4);
				break;
			case 2:
				personDao.readAllCustomer();
				break;
			case 3:
				personDao.updateCustomer();
				break;
			case 4:
				personDao.deleteCustomerById();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}
	}
}
