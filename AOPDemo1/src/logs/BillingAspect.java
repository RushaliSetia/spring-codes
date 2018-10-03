package logs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BillingAspect {

	@Before("within(p2.*)")
	public void billingLogs(){
		System.out.println("----------Billing logs-------");
	}
}
