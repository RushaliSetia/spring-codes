package com.info.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.info.bean.Book;
import com.info.db.BookDAOImpl;

public class ClientCode {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/info/res/spring-conf.xml");
		BookDAOImpl bookDAOImpl=ctx.getBean("bookDAOImpl", BookDAOImpl.class);
		System.out.println("Enter BookId");
		Scanner sc=new Scanner(System.in);
		int bookId=Integer.parseInt(sc.nextLine());
		Book book=bookDAOImpl.getBookById(bookId);
	
		System.out.println(book);
	}
}
