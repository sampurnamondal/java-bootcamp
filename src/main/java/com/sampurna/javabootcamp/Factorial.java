package com.sampurna.javabootcamp;

/**
 * This is one of the simplest programs you can expect in interviews. It is
 * generally asked to see if you can code or not. Sometimes interviewer may also
 * ask about changing a recursive solution to iterative one or vice-versa.
 */
public class Factorial {

	public static void main(String[] args) {
		Integer number = 4;
		Integer factorial = getFactorial(number);
		System.out.println(factorial);

	}

	public
	static Integer getFactorial(Integer number) {
		
		if (number == 1) {
			return 1;
		}
		return number * getFactorial(number - 1);
	}

}
