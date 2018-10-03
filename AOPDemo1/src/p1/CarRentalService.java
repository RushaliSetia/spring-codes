package p1;

public class CarRentalService {

	private Car car;
	private Driver driver;

	public CarRentalService() {
		super();
	}

	public CarRentalService(Car car, Driver driver) {
		super();
		this.car = car;
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "CarRentalService [car=" + car + ", driver=" + driver + "]";
	}

	public void bookCar() {
		System.out.println(car);
		System.out.println(driver);
	}

	public void doSomething(int i, String x) {

	}

	public void doExtraWork(String x) {

	}

	public void bookSharedCar() {
		System.out.println("bookSharedCar");
	}

	public void bookPremiumCar() {
		System.out.println("bookPremiumCar");
	}

	public void bookSedanCar() {
		System.out.println("bookSedanCar");
	}

	public void display(CarRentalService carRentalService) {
		System.out.println("-----CarRentalService Display called-----");
	}
}
