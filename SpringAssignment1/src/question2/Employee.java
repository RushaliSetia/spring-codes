package question2;

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

	public void printInfo(){
		System.out.println("employee id is:"+getEid());
		System.out.println("employee name is:"+getName());
		System.out.println("employee salary is:"+getSal());
	}
}
