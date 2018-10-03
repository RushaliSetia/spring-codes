package question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode_Annotations {

	 public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("question5/spring-conf_Annotations.xml");
		EmployeeAnnotations emp=(EmployeeAnnotations)ctx.getBean("employee");
		
		System.out.println(emp);
	}
}
