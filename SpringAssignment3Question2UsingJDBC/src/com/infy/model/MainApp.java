package com.infy.model;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.service.CustomerDAO;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/spring.xml");
		Customer customer1 = applicationContext.getBean("customer1", Customer.class);
		Customer customer2 = applicationContext.getBean("customer2", Customer.class);
		Customer customer3 = applicationContext.getBean("customer3", Customer.class);
		Customer customer4 = applicationContext.getBean("customer4", Customer.class);

		CustomerDAO customerDAO = new CustomerDAO();
		while (true) {
			System.out.println("-----MENU-----");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Display All Customers");
			System.out.println("4.Display Customer By ID");
			System.out.println("5.Display Customer Whose Purchase amount>50000");
			System.out.println("6.Display Customer Whose Age Between 30 & 50");
			System.out.println("7.Delete Customer By ID");
			System.out.println("8.Exit");
			System.out.println("Enter the choice:");
			Scanner scanner = new Scanner(System.in);
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				customerDAO.insertCustomer(customer1);
				customerDAO.insertCustomer(customer2);
				customerDAO.insertCustomer(customer3);
				customerDAO.insertCustomer(customer4);
				break;
			case 2:
				customerDAO.updateCustomer();
				break;
			case 3:
				customerDAO.displayAllCustomer();
				break;
			case 4:
				customerDAO.displayCustomerByID();
				break;
			case 5:
				customerDAO.displayCustomerByPurchaseAmount();
				break;
			case 6:
				customerDAO.displayCustomerByAge();
				break;
			case 7:
				customerDAO.deleteCustomerById();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;
			}// end of switch
		} // end of while
	}// end of main
}// end of class
