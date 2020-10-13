package com.sampurna.javabootcamp;

/*** Reverse a number **/

public class ReverseANumber {

	public static void main(String[] args) {

		Integer givenNumber = 129;
		Integer reversedNumber = getReverseOfNumber(givenNumber);
		System.out.println(reversedNumber);

	}

	private static Integer getReverseOfNumber(Integer givenNumber) {

		Integer reversedNumber = 0, number = givenNumber;

		//get reverse of number
		while (number > 10) {
			Integer temporaryNumber = number % 10;
			reversedNumber = reversedNumber * 10 + temporaryNumber;
			number = number / 10;
		}
		reversedNumber = reversedNumber * 10 + number;

		return reversedNumber;
	}

}
