/**
 * Write a program to check if two given String is Anagram of each other. Your
 * function should return true if two Strings are Anagram, false otherwise. A
 * string is said to be an anagram if it contains the same characters and same
 * length, but in a different order, e.g. army and Mary are anagrams
 ***/

package com.sampurna.javabootcamp;

import java.util.HashMap;
import java.util.Map;

public class StringAnarGramUsingHasMap {
	
	
	public static void main(String args[]) {
		
		String first = "triatngle"; 
		String second = "triatngle";
		
		Boolean isAnragram = findIfAnargram(first, second);
		
		if(isAnragram) {
			System.out.println(first + " " + "is an anargram of the" + " " + second);
		}else {
			System.out.println(first + " " + "is not an anargram of the" + " " + second);
		}
	}

	private static Boolean findIfAnargram(String first, String second) {
		
		if(first.length() == second.length() && first != null && second != null) {
			Map<Character, Integer> firstMap = getOccurences(first.toLowerCase());
			Map<Character, Integer> secondMap = getOccurences(second.toLowerCase());
			//return firstMap.equals(secondMap);
			return firstMap.entrySet().stream().allMatch(e -> e.getValue().equals(secondMap.get(e.getKey())));
		}
		return false;
	}

	private static Map<Character, Integer> getOccurences(String word) {
		Map<Character, Integer> wordMap = new HashMap<>();
		for(int i = 0; i < word.length(); i++) {
			if(wordMap.containsKey(word.charAt(i))) {
				wordMap.compute(word.charAt(i), (key, value) -> value + 1);
			}else {
				wordMap.put(word.charAt(i), 1);
			}
		}
		return wordMap;
	}
}
