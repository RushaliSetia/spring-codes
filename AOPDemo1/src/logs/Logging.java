package logs;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import p1.CarRentalService;

@Aspect
public class Logging {
	@Before(value = "execution(public void bookCar())")
	public void addLog() {
		System.out.println("---------Logs Added---------" + new Date());
	}

	@Before(value = "execution(public void set*(..))")
	public void addLogForSetter() {
		System.out.println("---------Logs Added for Setter---------" + new Date());
	}

	@Before(value = "execution(public void do*(..))")
	public void addLogDoSomething() {
		System.out.println("---------Logs Added for DoSomething---------" + new Date());
	}

	@Before(value = "execution(public void do*(String))") // do*(..,String) -> for last argument must be String
	public void addLogDoExtraWork() {
		System.out.println("---------Logs Added for DoExtraWork---------" + new Date());
	}

	@After("args(carRentalService)")
	public void addBookingLogs(CarRentalService carRentalService) {
		System.out.println("Log for --->" + carRentalService);
	}
}
