package logs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BookingAspect {

	// @Before("within(p1.CarRentalService.book*)")---> Doesn't work
	@Before("execution(public void p1.CarRentalService.book*())")
	public void bookingLogs() {
		System.out.println("-------------booking logs-----------");
	}
}
