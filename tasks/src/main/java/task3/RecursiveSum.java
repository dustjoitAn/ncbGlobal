package task3;

import util.Enums;

import java.util.Scanner;

public class RecursiveSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = -1;
		while (input != 0) {
			try {
				System.out.println(Enums.EXITING.getMessage() + "\n" + Enums.ENTER_NUMBER.getMessage());
				input = scanner.nextLong();
				if (input < 0) {
					throw new IllegalArgumentException();
				}
				if (input != 0) {
					System.out.println(Enums.SUM.getMessage() + getSum(input));
				}
			} catch (Exception e) {
				System.out.println(Enums.WRONG_DATA.getMessage());
				break;
			}
		}
	}

	static long getSum(long number) {
		if (number == 0) {
			return number;
		}
		return number + getSum(--number);
	}
}
