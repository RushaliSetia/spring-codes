package p1;

public class InvallidAgeException extends Exception {

	private String message;

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";

	};
}
