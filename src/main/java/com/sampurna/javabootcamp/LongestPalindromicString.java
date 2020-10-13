/*Find the longest palindromic string*/

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPalindromicString {

	public static void main(String[] args) {

		String givenString = "babad";
		String result = getLongestPalindrome(givenString);
		if (result != null) {
			System.out.println(result + " Is the longest palindrome.");
		}
	}

	private static String getLongestPalindrome(String givenString) {
		if (givenString == null || givenString.length() == 0) {
			return null;
		}

		Integer length = givenString.length();

		// filter to keep only lists with size more than 1
		HashMap<Character, List<Integer>> allIndicesMap = (HashMap<Character, List<Integer>>) getAllIndices(givenString)
				.entrySet().stream().filter(map -> map.getValue().size() > 1)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		String result = "";

		for (Object key : allIndicesMap.keySet()) {
			List<Integer> indexList = (List<Integer>) allIndicesMap.get(key);
			for (int i = 0, j = indexList.get(length - 1); j >= 0 && i < length; j--) {
				if (j == i) {
					i++;
					j = indexList.get(length - 1);
				}
				String subString = givenString.substring(i, j + 1);
				Boolean ifPalindrome = checkPalindrome(subString);
				if (ifPalindrome) {
					if (subString.length() > result.length()) {
						result = subString;
					}
					break;
				}
			}
		}
		return result;
	}

	private static Boolean checkPalindrome(String subString) {
		Integer length = subString.length();
		for (int i = 0; i < length / 2; i++) {
			if (!(subString.charAt(i) == subString.charAt(length - (i + 1)))) {
				return false;
			}
		}
		return true;
	}

	private static HashMap<Character, List<Integer>> getAllIndices(String givenString) {

		HashMap<Character, List<Integer>> allIndicesMap = new HashMap<>();

		for (int i = 0; i < givenString.length(); i++) {
			Character givenCharacter = givenString.charAt(i);
			if (!(allIndicesMap.containsKey(givenCharacter))) {
				List<Integer> indexList = new ArrayList<>();
				indexList.add(i);
				allIndicesMap.put(givenCharacter, indexList);
			} else {
				List<Integer> indexList = allIndicesMap.get(givenCharacter);
				indexList.add(i);
				allIndicesMap.put(givenCharacter, indexList);
			}
		}
		return allIndicesMap;
	}
}
