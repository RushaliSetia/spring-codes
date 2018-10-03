package p1;

@Aspect
public class AgeAspectTrue {

	@After("args(age)")
	public void correctAge(int age){
		System.out.println(age+"----Using AgeAspectTrue");
	}

	@AfterReturning("")
	public void check(){

	}
}
