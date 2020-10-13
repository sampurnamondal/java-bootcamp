package com.sampurna.javabootcamp;

/**** The first non-repeated character of String *****/

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String givenString = "a";
		String nonRepeatedCharacter = getNonRepeatedCharacter(givenString);

		System.out.println(nonRepeatedCharacter);
	}

	private static String getNonRepeatedCharacter(String givenString) {

		String nonRepeatedCharacter = "No non repeated characters.";

		if (nonRepeatedCharacter == null || nonRepeatedCharacter == "") {
			return "Given string invalid.";
		}

		// find the first non repeated character
		for (int i = 0; i < givenString.length(); i++) {

			Character letter = givenString.charAt(i);
			Integer indexFirstOccurence = givenString.indexOf(letter);
			Integer indexOtherOccurence = givenString.indexOf(letter, i + 1);

			if (indexOtherOccurence == -1 && indexFirstOccurence == i) {
				return letter.toString() + " " + "is the first non repeated character";
			}
		}
		return nonRepeatedCharacter;
	}
}
