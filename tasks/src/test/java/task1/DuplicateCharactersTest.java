package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DuplicateCharactersTest {

	@Test
	void findDuplicatesInWord() {
		String word = "Auuhstewdsdd";
		Assertions.assertTrue(DuplicateCharacters.findDuplicateCharacters(word).contains('u'));
		Assertions.assertTrue(DuplicateCharacters.findDuplicateCharacters(word).contains('d'));
		Assertions.assertFalse(DuplicateCharacters.findDuplicateCharacters(word).contains('f'));
	}



}