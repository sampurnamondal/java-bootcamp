package com.sampurna.javabootcamp;

/*** Get first repeated character in a string ***/

public class FirstRepeatedCharacter {

	public static void main(String[] args) {

		String givenString = null;
		String repeatedCharacter = getFirstRepeatedCharacter(givenString);
		System.out.println(repeatedCharacter);
	}

	public static String getFirstRepeatedCharacter(String givenString) {

		String firstRepeatedCharacter = "No repeated character";

		if (givenString == null || givenString.length() == 0) {
			return "Invalid string given.";
		}

		for (int i = 0; i < givenString.length() - 1; i++) {
			Character letter = givenString.charAt(i);

			Integer index = givenString.indexOf(letter, i + 1); // Getting repeated character by checking if more than
																// one index exists
			if (index != -1) {
				return letter.toString();
			}
		}

		return firstRepeatedCharacter;
	}

}
