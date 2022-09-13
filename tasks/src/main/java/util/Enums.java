package util;

public enum Enums {
	URL("https://restcountries.com/v3.1/all"),
	ERROR_MESSAGE("Error during the process: "),
	EXITING_MESSAGE("(For exiting please enter 0): "),
	PROVIDE_INPUT_MESSAGE("Please input the expression in which you want to find duplicates: "),
	FOUND_DUPLICATES_MESSAGE("Here are the duplicate characters in the string you provided: "),
	NO_DUPLICATES_MESSAGE("There are no duplicates in the provided expression!"),
	MINIMUM("Minimum: "),
	MAXIMUM("Maximum: "),
	MIN_AND_MAX("Minimum and Maximum: "),
	WRONG_DATA("Please provide a valid data."),
	ENTER_NUMBER("Please enter the number: "),
	SUM("Sum of the input is: "),
	;

	private String message;

	Enums(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
