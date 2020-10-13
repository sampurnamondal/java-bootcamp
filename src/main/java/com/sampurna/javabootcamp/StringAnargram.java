package com.sampurna.javabootcamp;


/**
 * Write a program to check if two given String is Anagram of each other. Your
 * function should return true if two Strings are Anagram, false otherwise. A
 * string is said to be an anagram if it contains the same characters and same
 * length, but in a different order, e.g. army and Mary are anagrams
 ***/

public class StringAnargram {

	public static void main(String[] args) {

		String firstString = "army";
		String secondString = "mary";
		Boolean isAnargram = isAnargram(firstString, secondString);

		if (isAnargram) {
			System.out.println(firstString + " " + "is an anargram of" + " " + secondString);
		} else {
			System.out.println(firstString + " " + "is not an" + " anargram of" + " " + secondString);
		}

	}

	private static Boolean isAnargram(String firstString, String secondString) {

		Boolean isAnargram = true;

		if (firstString == null || secondString == null || firstString == "" || secondString == "") {
			return false;
		}

		if (firstString.length() != secondString.length()) {
			return false;
		}

		for (int i = 0; i < firstString.length(); i++) {

			if (!(secondString.contains(String.valueOf(firstString.charAt(i))))) {
				return false;
			}
		}

		return isAnargram;
	}

}
