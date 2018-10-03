package question3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import question3.EmployeeServiceImpl;

public class ClientCode {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("question3/spring-conf.xml");
		System.out.println("---------->> ctx : "+ctx);
		
		
		EmployeeServiceImpl emp = ctx.getBean("employeeImp",EmployeeServiceImpl.class);
		
		System.out.println(" emp "+emp);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
	    emp.setName(name);

		try {
			emp.getEmployeebyName(name);
		} catch (NullPointerException e) {

		}
		
		System.out.println(emp);
	}
}
