package com.sampurna.javabootcamp;

/*** Find out if the given year is a leap year ***/
public class LeapYear {

	public static void main(String[] args) {
		Integer givenYear = 2000;
		Boolean isLeapYear = isLeapYear(givenYear);
		
		if (isLeapYear) {
			System.out.println(givenYear + " " + "is a leap year.");
		} else {
			System.out.println(givenYear + " " + "is not a leap year.");
		}

	}

	public static Boolean isLeapYear(Integer givenYear) {

		if (givenYear == null) {
			return false;
		}

		if (givenYear % 4 == 0) {
			return true;
		}

		return false;

	}

}
