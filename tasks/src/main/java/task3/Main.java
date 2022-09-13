package task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = -1;
		while (input != 0) {
			try {
				System.out.println("(For exiting please enter 0)\nPlease enter the number: ");
				input = scanner.nextLong();
				if (input < 0) {
					throw new IllegalArgumentException();
				}
				if (input != 0) {
					System.out.println("Summary of the input is: " + getSum(input));
				}
			} catch (Exception e) {
				System.out.println("Please enter valid number!");
				break;
			}
		}
	}


	static long getSum(long number) {
		long sum = 0;
		if (number == 0) {
			return sum;
		}
		return number + getSum(--number);
	}
}
