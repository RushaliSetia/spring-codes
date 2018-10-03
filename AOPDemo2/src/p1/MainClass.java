package p1;

public class MainClass {

	User user;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/conf.xml");
		MainClass mainClass = new MainClass();
		mainClass.user = applicationContext.getBean("user", User.class);
		mainClass.doStuff();
	}

	public void doStuff() {
		user.setAge(19);
		user.setName("Mike");
		try {
			user.isValidAge(user.getAge());
		} catch (InvalidAgeException ie) {
		}
	}
}
