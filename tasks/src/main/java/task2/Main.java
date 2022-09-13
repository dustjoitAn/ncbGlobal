package task2;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		int[] array = { -98, 0, -100, 8000 };
		array = sort(array);
		int[] minAndMax;
		try {
			minAndMax = getFirstAndLastValues(array);
			if (minAndMax.length == 2)
				System.out.println("Minimum: " + minAndMax[0] + ", Maximum: " + minAndMax[1]);
			else
				System.out.println("Minimum and  Maximum: " + minAndMax[0]);
		} catch (Exception e) {
			System.out.println("Please provide a good data.");
		}
	}

	static int[] getFirstAndLastValues(int[] array) {
		if (array != null && array.length == 1)
			return new int[] { array[0] };
		if (array != null && array.length >= 2) {
			return new int[] { array[0], array[array.length - 1] };
		}
		throw new NoSuchElementException();
	}

	static int[] sort(int[] array) {
		Set<Integer> integerSet = Arrays.stream(array).boxed().collect(Collectors.toCollection(TreeSet::new));
		return integerSet.stream().mapToInt(Number::intValue).toArray();
	}

}
