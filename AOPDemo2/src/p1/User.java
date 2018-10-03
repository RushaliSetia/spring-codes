package p1;

public class User {

	private int age;
	private String name;

	public User() {
		super();
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	public void isValidAge(int age) throws InvalidAgeException {
		// boolean isValid=true;
		if (age < 18) {
			// isValid=false;
			throw new InvalidAgeException("Invalid Age");
		}
		// return isValid;
	}
}
