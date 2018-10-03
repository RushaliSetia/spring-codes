package question1;

public class Employee {

	private String name;
	private float sal;
	private int eId;

	public Employee() {
		super();
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
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
	
	public Employee(int eId, String name, float sal) {
		super();
		this.eId = eId;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
