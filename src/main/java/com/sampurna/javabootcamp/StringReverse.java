package com.sampurna.javabootcamp;

/***
 * This problem is similar to the String Palindrome problem we have discussed
 * above. If you can solve that problem, you can solve this as well. You can use
 * indexOf() or substring() to reverse a String or alternatively, convert the
 * problem to reverse an array by operating on character array instead of
 * String.
 */

public class StringReverse {

	public static void main(String[] args) {
		
		String givenString = "Java code";
		String reversedString = getReversedString(givenString);
		System.out.println(reversedString);
	}

	public static String getReversedString(String givenString) {
		
		if (givenString == null || givenString.length() == 0) {
			return "Invalid string given.";
		}

		//reversing string
		StringBuilder given = new StringBuilder(givenString);
		return given.reverse().toString();
	}
}
