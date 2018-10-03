package question3;

public class Department {

	private String deptName,deptLoc;

	public Department() {
		super();
	}

	public Department(String deptName, String deptLoc) {
		super();
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
	
}
