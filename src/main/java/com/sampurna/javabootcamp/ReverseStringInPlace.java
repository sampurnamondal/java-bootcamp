package com.sampurna.javabootcamp;
/** Reverse a String in place ***/

public class ReverseStringInPlace {

	public static void main(String[] args) {

		String givenString = "Java";
		String reverse = getReverse(givenString);
		System.out.println(reverse);
	}

	private static String getReverse(String givenString) {

		if (givenString == null || givenString.length() == 0) {
			return "Invalid or empty string given";
		}
		
		StringBuilder builder = new StringBuilder(givenString);
		Integer length = builder.length();

		//reversing String in Place
		for (int i = 0; i < builder.length() / 2; i++) {
			Character temp = builder.charAt(i);
			builder.setCharAt(i, builder.charAt(length - i - 1));
			builder.setCharAt(length - i - 1, temp);
		}
		return builder.toString();
	}

}
