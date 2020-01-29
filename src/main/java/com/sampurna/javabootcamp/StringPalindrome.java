package com.sampurna.javabootcamp;

/**
 * You need to write a simple Java program to check if a given String is
 * palindrome or not. A Palindrome is a String which is equal to the reverse of
 * itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also
 * "Bob." Though be prepared with both recursive and iterative solution of this
 * problem. The interviewer may ask you to solve without using any library
 * method, e.g. indexOf() or subString() so be prepared for that.
 */
public class StringPalindrome {

	public static void main(String[] args) {

		String givenString = null;

		if (isPalindrome(givenString)) {
			System.out.println("is a Palindrome");
		} else {
			System.out.println("is not a Palindrome");
		}

	}

	public static Boolean isPalindrome(String givenString) {

		Boolean isPalindrome = true;

		if (givenString == null || givenString.length() == 0) {
			return false;
		}

		Integer stringLength = givenString.length();
		for (int i = 0; i < stringLength / 2; i++) {
			if (givenString.charAt(i) != givenString.charAt(stringLength - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

}
