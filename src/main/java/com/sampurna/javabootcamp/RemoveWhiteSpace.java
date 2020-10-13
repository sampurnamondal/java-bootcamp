/*Remove white space in string*/

package com.sampurna.javabootcamp;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String givenString = "This is a String.";
		String withoutWhiteSpace = removeWhiteSpace(givenString);
		System.out.println(withoutWhiteSpace);
	}

	private static String removeWhiteSpace(String givenString) {
		
		String withoutWhiteSpace = "";
		if(givenString == null || givenString.length() == 0) {
			return "Invalid or empty string";
		}
		
		//removing whitespace by replacing space tab (\\s) with empty string
		withoutWhiteSpace = givenString.trim().replaceAll("\\s", "");
		return withoutWhiteSpace;
		
	}

}
