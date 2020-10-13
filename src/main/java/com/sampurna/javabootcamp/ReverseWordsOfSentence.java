package com.sampurna.javabootcamp;

/***
 * Reverse words of a sentence
 ****/

public class ReverseWordsOfSentence {

	public static void main(String[] args) {
		
		String givenString = "This is a Java code";
		String reverse = getReversedWordsOfSentence(givenString);
		System.out.println(reverse);
	}

	private static String getReversedWordsOfSentence(String givenString) {
		
		StringBuilder outputString = new StringBuilder();

		if (givenString == null || givenString.length() == 0) {
			return "Invalid string given";
		}

		String[] givenWords = givenString.split(" ");        //splitting the string with white space as the delimiter
		for (String word : givenWords) {
			StringBuilder output = new StringBuilder(word);  // converting each word into a StringBuilder object
			outputString.append(output.reverse());           //reversing each word in string and appending 
		}

		return outputString.toString();
	}

}
