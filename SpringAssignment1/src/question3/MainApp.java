package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("question3/spring.xml");
		Employee emp=(Employee) ac.getBean("employee");
		System.out.println(emp);
	}

}
