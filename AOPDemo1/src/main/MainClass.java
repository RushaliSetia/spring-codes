package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Car;
import p1.CarRentalService;
import p1.Driver;

public class MainClass {

	CarRentalService carRentalService = null;

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/config.xml");
		mainClass.carRentalService = applicationContext.getBean("carRentalService", CarRentalService.class);
		mainClass.doStuff();
		mainClass.anotherDoStuff();
	}

	public void doStuff() {
		carRentalService.setCar(new Car("Mercedes", "DL-1234"));
		carRentalService.setDriver(new Driver("Mike"));
		carRentalService.bookCar();
		carRentalService.display(carRentalService);
	}

	public void anotherDoStuff() {
		carRentalService.bookPremiumCar();
		carRentalService.bookSedanCar();
		carRentalService.bookSharedCar();
	}
}
