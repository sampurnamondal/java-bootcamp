package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;


/*** Print repeated characters of String ***/

public class RepeatedCharactersInString {

	public static void main(String[] args) {
		
		String givenString = "faer";
		List<String> repeatedCharacters = new ArrayList<>();
		repeatedCharacters = getRepeatedCharacters(givenString);

		System.out.println(repeatedCharacters);

	}

	public static List<String> getRepeatedCharacters(String givenString) {
		
		List<String> repeatedCharacters = new ArrayList<>();

		if (givenString == null || givenString.length() == 0) {
			return repeatedCharacters;
		}

		//searching for repeated characters
		for (int i = 0; i < givenString.length() - 1; i++) {
			Character letter = givenString.charAt(i);
			Integer index = givenString.indexOf(letter, i + 1);
			if (index != -1) {
				repeatedCharacters.add(letter.toString());
			}
		}
		return repeatedCharacters;
	}

}
