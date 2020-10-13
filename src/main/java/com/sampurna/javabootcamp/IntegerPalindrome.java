package com.sampurna.javabootcamp;

/***
 * An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a
 * palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not
 * equal to 1234.
 ****/

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		Integer givenNumber = 121;
		Boolean isPalindrome = isPalindrome(givenNumber);

		if (isPalindrome) {
			System.out.println(givenNumber + " " + "is a Palindrome.");
		} else {
			System.out.println(givenNumber + " " + "is not a Palindrome.");
		}
	}

	public static Boolean isPalindrome(Integer givenNumber) {
		
		Integer newNumber = 0, number = givenNumber, temporaryNumber = 0;
		Boolean isPalindrome = false;

		if (givenNumber == null || givenNumber < 0) {
			return false;
		}

		// calculating is given number is a palindrome
		while (number > 10) {
			temporaryNumber = number % 10;
			newNumber = newNumber * 10 + temporaryNumber;
			number = number / 10;
		}
		newNumber = newNumber * 10 + number;
		System.out.println(newNumber);

		if (newNumber.equals(givenNumber)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
