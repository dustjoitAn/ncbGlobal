package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.NoSuchElementException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

	@Test
	void findMinAndMax() {
		int[] array = {8, -1};
		int[] minAndMax = Main.getFirstAndLastValues(array);
		Assertions.assertEquals(8, minAndMax[0]);
		Assertions.assertEquals(-1, minAndMax[minAndMax.length - 1]);
	}

	@Test
	void findMinAndMaxExceptionCase() {
		int[] array = {};
		Assertions.assertThrows(NoSuchElementException.class, () -> Main.getFirstAndLastValues(array));
	}

	@Test
	void sort() {
		int[] array = {8, -1};
		int[] minAndMax = Main.sort(array);
		Assertions.assertEquals(-1, minAndMax[0]);
		Assertions.assertEquals(8, minAndMax[minAndMax.length - 1]);
	}
}