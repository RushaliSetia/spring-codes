package question5;

import java.util.Scanner;

public class Employee_Interface implements Methods{

	Scanner sc=new Scanner(System.in);
	private int empId;
	private String name;
	private double empSal;
	
	public Employee_Interface() {
		// TODO Auto-generated constructor stub
	}

	public Employee_Interface(int empId, String name, double empSal) {
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
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empSal=" + empSal + "]";
	}

	@Override
	public void printDetails() {
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Salary : "+getEmpSal());
	}
}
