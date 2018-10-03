package question5;

import java.util.Scanner;


public class EmployeeAnnotations {

	Scanner sc=new Scanner(System.in);
	private int empId;
	private String name;
	private double empSal;
	
	public EmployeeAnnotations() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeAnnotations(int empId, String name, double empSal) {
		super();
		this.empId = empId;
		this.name = name;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	public void init()
	{
	   System.out.println("Enter Employee Name");
	   String empName=sc.nextLine();
	   this.name=empName;
	   
	   System.out.println("Enter Employee Salary");
	   double empSal=Double.parseDouble(sc.nextLine());
	   this.empSal=empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empSal=" + empSal + "]";
	}
}
