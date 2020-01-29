package com.sampurna.javabootcamp;

/**
 * A number is called an Armstrong number if it is equal to the cube of its
 * every digit. For example, 153 is an Armstrong number because of 153= 1+
 * 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check
 * if the given number is Armstrong number or not.
 **/

public class ArmstrongNumber {

	public static void main(String[] args) {
		Integer numGiven = 153;
		Integer endValue = 0;
		char[] numInString = numGiven.toString().toCharArray();
		for (Character c : numInString) {
			Integer temp = Integer.parseInt(c.toString());
			endValue += temp * temp * temp;
		}
		if (endValue.equals(numGiven)) {
			System.out.println(numGiven + " is an ArmStrong number.");
		}

	}

}
