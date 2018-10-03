package com.info.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.info.beans.Book;
import com.info.db.BookDAOImp1;

public class MainClass {
	public static void main(String[] args) {
    /* Book book=new BookDAOImp1().getBookById(10);
     System.out.println(book);*/
		ApplicationContext ctx= new ClassPathXmlApplicationContext ("com/info/res/Spring-cong.xml");
       Book book;
	try {
		book = ctx.getBean("bookDAOImp1",BookDAOImp1.class).getBookById(10);
		 System.out.println(book);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
	}
      
		
		/* Book book=  (Book) ctx.getBean("book");
        try {
			book.display();
		} catch (Exception e) {
			
		}*/
        
        
	}
}
