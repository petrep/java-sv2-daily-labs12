package day05;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		StringStatistics stringStatistics = new StringStatistics();
		Map<Character, Integer> result = stringStatistics.numberOfCharactersByCharacter("alFmafAa");

		for (Map.Entry<Character, Integer> actual : result.entrySet()) {
			System.out.println(actual.getKey() + " " + actual.getValue());
		}
	}
}
