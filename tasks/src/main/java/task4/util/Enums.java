package task4.util;

public enum Enums {
	URL("https://restcountries.com/v3.1/all"),
	ERROR_MESSAGE("Error during the process: ");

	private String message;

	Enums(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
