package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (!"0".equals(input)) {
			System.out.println("(For exiting please enter 0)\nPlease input the expression in which you want to find duplicates: ");
			input = scanner.nextLine();
			if (!"0".equals(input)) {
				Set<Character> duplicateCharacters = findDuplicateCharacters(input);
				if (duplicateCharacters.size() != 0)
					System.out.println("Here are the duplicate characters in the string you provided: " + duplicateCharacters);
				else
					System.out.println("There are no duplicates in the provided expression!");
			}
		}
	}

	static Set<Character> findDuplicateCharacters(String expression) {
		return findDuplicatesInMap(stringCharsToMap(expression)).keySet();
	}

	static Map<Character, Integer> stringCharsToMap(String expression) {
		Map<Character, Integer> characterMap = new HashMap<>();
		for (int i = 0; i < expression.length(); i++) {
			int count = 1;
			if (characterMap.containsKey(expression.charAt(i))) {
				count += characterMap.get(expression.charAt(i));
			}
			characterMap.put(expression.charAt(i), count);
		}
		return characterMap;
	}

	static Map<Character, Integer> findDuplicatesInMap(Map<Character, Integer> map) {
		return map.entrySet().stream()
				.filter(x -> x.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

}
