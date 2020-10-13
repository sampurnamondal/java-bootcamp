/*Given a string, find the length of the longest substring without repeating characters.*/

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		String givenString = null;
		int length = lengthOfLongestSubstring(givenString);
		System.out.println("Length " + length);

	}

	public static Integer lengthOfLongestSubstring(String givenString) {

		Map<Character, Integer> substringLengthsMap = new HashMap<>();
		List<Character> letterOccurence = new ArrayList<Character>();

		if (givenString != null && givenString.length() != 0) {
			Integer length = givenString.length();
			for (int i = 0; i < length;) {
				Character letter = givenString.charAt(i);
				if (!letterOccurence.contains(letter)) {
					letterOccurence.add(letter);
					i = i + 1;
					if (i == length) {

						substringLengthsMap = createMap(letterOccurence, substringLengthsMap);
					}
				} else {

					substringLengthsMap = createMap(letterOccurence, substringLengthsMap);
					i = i - letterOccurence.size() + 1;
					letterOccurence.clear();
				}
			}

			List<Integer> mapValues = new ArrayList<Integer>(substringLengthsMap.values());
			Collections.sort(mapValues, Collections.reverseOrder());
			return mapValues.get(0);
			// Collections.sort(substringLengthsMap.values().stream().collect(Collectors.toList()),
			
		}else {
			return 0;
		}
	}

	public static Map<Character, Integer> createMap(List<Character> letterOccurence,
			Map<Character, Integer> substringLengthsMap) {
		if (substringLengthsMap.containsKey(letterOccurence.get(0))) {
			if (letterOccurence.size() > substringLengthsMap.get(letterOccurence.get(0))) {
				substringLengthsMap.compute(letterOccurence.get(0), (key, value) -> letterOccurence.size());
			}
		} else {
			substringLengthsMap.put(letterOccurence.get(0), letterOccurence.size());
		}
		return substringLengthsMap;
	}
}
