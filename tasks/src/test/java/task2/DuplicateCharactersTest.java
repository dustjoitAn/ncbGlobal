package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.NoSuchElementException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DuplicateCharactersTest {

	@Test
	void findMinAndMax() {
		int[] array = {8, -1};
		int[] minAndMax = MinAndMax.getFirstAndLastValues(array);
		Assertions.assertEquals(8, minAndMax[0]);
		Assertions.assertEquals(-1, minAndMax[minAndMax.length - 1]);
	}

	@Test
	void findMinAndMaxExceptionCase() {
		int[] array = {};
		Assertions.assertThrows(NoSuchElementException.class, () -> MinAndMax.getFirstAndLastValues(array));
	}

	@Test
	void sort() {
		int[] array = {8, -1};
		int[] minAndMax = MinAndMax.sort(array);
		Assertions.assertEquals(-1, minAndMax[0]);
		Assertions.assertEquals(8, minAndMax[minAndMax.length - 1]);
	}
}