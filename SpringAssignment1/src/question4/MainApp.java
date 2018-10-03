package question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("question4/spring.xml");
		Employee emp=(Employee)ac.getBean("employee");
		emp.getData();
		System.out.println(emp);
		Employee employee1=(Employee)ac.getBean("employee");
		System.out.println(employee1);
		emp.printInfo();
	}

}
