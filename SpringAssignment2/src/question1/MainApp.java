package question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("question1/spring.xml");
		Student stu=(Student)ac.getBean("student");
		stu.printInfo();
	}
}
