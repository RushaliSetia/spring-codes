package question3;

public class Employee {

	private int eid;
	private String name;
	private Department dept;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, Department dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
