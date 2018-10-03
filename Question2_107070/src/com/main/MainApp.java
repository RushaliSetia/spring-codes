package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AdminLogin;
import com.bean.TicketDetails;
import com.bean.TrainDetails;
import com.dao.TicketDAO;

public class MainApp {

	private static final String String = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainApp object = new MainApp();
		TicketDAO ticketDao;
		TrainDetails trainDetails;
		TicketDetails ticketDetails;
		AdminLogin adminLogin;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/res/spring-conf.xml");
		trainDetails = (TrainDetails) ctx.getBean("train");
		ticketDetails=(TicketDetails)ctx.getBean("ticket");
		adminLogin=(AdminLogin)ctx.getBean("admin");
		ticketDao = (TicketDAO) ctx.getBean("ticketdao");
		
		while (true) {
			System.out.println("--------options-----");
			System.out.println("0.Exit\n1.login\n2.show trains\n3.book ticket\n4.cancel ticket");
			System.out.println("enter choice:");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("enter username:");
				String username = sc.nextLine();
				System.out.println("enter password:");
				String password = sc.nextLine();
				ticketDao.login(username, password);
				break;
			case 2:
				ticketDao.showTrains();
				break;
			case 3:
				System.out.println("enter the ticket no:");
				int ticketnumber = Integer.parseInt(sc.nextLine());
				ticketDao.bookTicket(ticketnumber);
				break;
			case 4:
				System.out.println("enter the ticket no:");
				int ticketnumber1 = Integer.parseInt(sc.nextLine());
				ticketDao.cancelTicket(ticketnumber1);
				break;
			default:
				System.out.println("invalid choice;please choose again!!!!");
			}// end switch
		} // end while
	}// end main

}// end class
