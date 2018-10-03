package com.info.beans;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BookAspect {
	/*@Before("execution(public int display(..))")
	public void log() {
		System.out.println("aspect execute before");
	}
	
	@After("execution(public int display(..))")
	public void log1() {
		System.out.println("aspect execute after");
	}
	
	@AfterReturning(pointcut="execution(public int display(..))",returning="result")
	public void log2(JoinPoint jp,Object result) {
		System.out.println("aspect execute after"+result);
	}
	
	@AfterThrowing(pointcut="execution(public int display(..))",throwing="ex")
	public void log3(Exception ex) {
		System.out.println(ex.getMessage());
	}*/
	
	
	
	
	@Before("execution(public Book getBookById(..))")
	public void log4() {
		System.out.println("aspect execute before");
	}
	
	@After("execution(public Book getBookById(..))")
	public void log5() {
		System.out.println("aspect execute after");
	}
	
	@AfterReturning(pointcut="execution(public Book getBookById(..))",returning="result")
	public void log2(JoinPoint jp,Object result) {
		Object arr[]=jp.getArgs();
		for(Object object:arr)
		{
			System.out.println(object);
		}
		System.out.println("aspect execute after returning"+result);
	}
	
	@AfterThrowing(pointcut="execution(public Book getBookById(..))",throwing="ex")
			public void log6(Exception ex) {
			System.out.println("aspect execute after throwing "+ex);	
		
	}
	
}
