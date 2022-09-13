package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

	@Test
	void findDuplicatesInWord() {
		String word = "Auuhstewdsdd";
		Assertions.assertTrue(Main.findDuplicateCharacters(word).contains('u'));
		Assertions.assertTrue(Main.findDuplicateCharacters(word).contains('d'));
		Assertions.assertFalse(Main.findDuplicateCharacters(word).contains('f'));
	}



}