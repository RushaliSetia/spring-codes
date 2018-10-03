package p1;

public class Driver {

	private String driverName;

	public Driver() {
		super();
	}

	public Driver(String driverName) {
		super();
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + "]";
	}
}
