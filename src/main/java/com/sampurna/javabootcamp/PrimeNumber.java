package com.sampurna.javabootcamp;

/**
 * Write a Java program to check if a given number is prime or not. Remember, a
 * prime number is a number which is not divisible by any other number, e.g. 3,
 * 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square
 * root of a number, etc.
 * 
 **/
public class PrimeNumber {

	public static void main(String[] args) {

		Integer num = 2;

		if (num > 1 && isPrime(num)) {

			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	private static Boolean isPrime(Integer num) {
		Boolean isNotPrime = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isNotPrime = true;
				break;
			}
		}

		return !isNotPrime;
	}

}
