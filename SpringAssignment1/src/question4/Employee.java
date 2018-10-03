package question4;

import java.util.Scanner;

public class Employee {

	private int eid;
	private String name;
	private float sal;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, float sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	static Employee getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID:");
		int eId = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter Name:");
		String name = scanner.nextLine();
		System.out.println("Enter Salary:");
		float sal = Float.parseFloat(scanner.nextLine());
		return new Employee(eId, name, sal);
	}

	public void printInfo() {
		System.out.println("employee id is:" + eid);
		System.out.println("employee name is:" +name );
		System.out.println("employee salary is:" + sal);
	}
}
