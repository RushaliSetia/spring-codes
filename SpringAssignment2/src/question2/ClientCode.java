package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("question2/spring-config.xml");
		Club club=(Club)ctx.getBean("club");
		
		System.out.println(club);//byName autoWiring
		
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("question2/spring-config_ByType.xml");
		Club club1=(Club)ctx1.getBean("club1");
		
		System.out.println(club1);//byType autoWiring
		
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("question2/spring-config_ByConstructor.xml");
		Club club2=(Club)ctx2.getBean("club2");
		
		System.out.println(club2);//byConstructor
		
		
	}
}
