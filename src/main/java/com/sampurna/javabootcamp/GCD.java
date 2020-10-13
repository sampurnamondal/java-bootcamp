package com.sampurna.javabootcamp;

/*** GCD of two numbers ***/

public class GCD {

	public static void main(String[] args) {

		Integer number1 = 22, number2 = 42;
		Integer gcd = getGCD(number1, number2);

		if (gcd != null) {
			System.out.println(gcd + " " + "is gcd of given numbers");
		} else {
			System.out.println("Invalid numbers given.");
		}
	}

	private static Integer getGCD(Integer number1, Integer number2) {

		// finding gcd using Euclid's method
		if (number1 == null || number2 == null) {
			return null;
		} else if (number1 == 0 || number1 == number2) {
			return number2;
		} else if (number2 == 0) {
			return number1;
		}

		return getGCD(number2, number1 % number2);

	}

}
