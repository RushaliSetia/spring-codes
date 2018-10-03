package com.aspect;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import com.bean.TicketDetails;
import com.dao.TicketDAO;
import com.exception.InvalidUsernameAndPassword;

@Aspect
public class MyAspect {

	Connection connection;
	PreparedStatement ps;

	@After("execution(public void bookTicket(..))")
	public void displayTicketBooked(int trainno) {
		System.out.println("display by after aspect");
		new TicketDAO().bookTicket(trainno);
	}

	@After("execution(public void login(..))")
	public void displayAllTrains() {
		new TicketDAO().showTrains();
	}

	@AfterThrowing(pointcut = "execution(public void login(..))", throwing = "ex")
	public void displayException(InvalidUsernameAndPassword ex) {
		System.out.println("aspect execute after throwing " + ex);
	}

	@AfterReturning(pointcut = "execution(public TicketDetails bookTicket(..))", returning = "result")
	public void log(org.aspectj.lang.JoinPoint jp, Object result) {
		Object arr[] = jp.getArgs();
		for (Object object : arr) {
			System.out.println(object);
		}
		System.out.println("aspect execute after returning " + result);
	}
}
