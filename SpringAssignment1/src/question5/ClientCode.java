package question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	 public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("question5/spring-conf.xml");
		Employee emp=(Employee)ctx.getBean("employee");
		
		System.out.println(emp);
	}
}
