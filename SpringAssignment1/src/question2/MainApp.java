package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("question2/spring.xml");
		Employee emp=(Employee)ac.getBean("employee");
		emp.printInfo();

	}

}
