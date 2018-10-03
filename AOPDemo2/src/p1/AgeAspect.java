package p1;

@Aspect
public class AgeAspect {

	@AfterThrowing(pointcut="args(age)",throwing="ie")
	public void checkAge(int age,InvalidAgeException ie){
		System.out.println(ie+" ---->Using AgeAspect");
	}
}
