package question3;

import org.springframework.context.annotation.Configuration;


public class EmployeeServiceImpl implements EmployeeService{

	String name;
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeServiceImpl(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "EmployeeServiceImpl [name=" + name + "]";
	}

	@Override
	public void getEmployeebyName(String name) throws NullPointerException{
		
		if(validateName(name))
		{
			System.out.println(" inside if of getEmployeename ");
			throw new NullPointerException("Please Enter Name. It is null");
		}
		else
		{
			System.out.println("Your name is : "+name);
		}
	}
	
	public boolean validateName(String name)
	{
		if(name==null || name=="")
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
