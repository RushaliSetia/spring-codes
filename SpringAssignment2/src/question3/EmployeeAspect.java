package question3;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {

	@AfterThrowing(pointcut="execution(public void getEmployeebyName(..))", throwing = "ex")
	public void afterThrowing(JoinPoint jp,Exception ex) {
		
		System.out.println("------------>> afterThrowing 1");
		
		Object obj = jp.getTarget();
		
		System.out.println("Name is : " +obj);
		System.out.println("Exception : " + ex.getMessage());
	}

	@AfterReturning("within(question3.*)")
	public void log() {
		System.out.println("Created on : " + new Date());
	}
}
