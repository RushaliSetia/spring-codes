package question1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("question1/spring.xml");
		Employee employee = (Employee) ac.getBean("employee");
		System.out.println("employee name:" + employee.getName());
		System.out.println("employee id:" + employee.geteId());
		System.out.println("employee salary:" + employee.getSal());
		System.out.println("----------------------------------------------");
		Resource res = new ClassPathResource("question1/spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Employee employee2 = (Employee) factory.getBean("employee1");
		System.out.println("Name:" + employee2.getName());
		System.out.println("ID:" + employee2.geteId());
		System.out.println("Salary:" + employee2.getSal());
		System.out.println(employee2);

	}

}
