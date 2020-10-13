package com.sampurna.javabootcamp;

/**
 * A number is called an Armstrong number if it is equal to the cube of its
 * every digit. For example, 153 is an Armstrong number because of 153= 1+
 * 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check
 * if the given number is Armstrong number or not.
 **/

public class ArmstrongNumber {

	public static void main(String[] args) {
		Integer givenNumber = 153;
		Boolean isArmstrongNumber = isArmstrongNumber(givenNumber);

		if (isArmstrongNumber) {
			System.out.println(givenNumber + " " + "is an Armstrong number.");
		} else {
			System.out.println(givenNumber + " " + "is not an Armstrong number.");
		}

	}

	public static Boolean isArmstrongNumber(Integer givenNumber) {

		Boolean isArmstrongNumber = false;
		Integer endValue = 0, number = givenNumber;

		if (number == null || number < 0) {
			return false;
		}

		//calculating if given number is an Armstrong number
		while (number > 0) {
			endValue += (number % 10) * (number % 10) * (number % 10);
			number = number / 10;
		}

		if (endValue.equals(givenNumber)) {
			isArmstrongNumber = true;
		}

		return isArmstrongNumber;

	}

}
