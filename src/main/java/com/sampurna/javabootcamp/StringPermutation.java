package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to print all permutations of a given String. For example, if given String is 
 * "GOD" then your program should print all 6 permutations of this string, 
 * e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."**/

public class StringPermutation {

	public static void main(String[] args) {

		String givenString = "GOD"; 
		List<String> permutations = getPermutations(givenString);
		for(String word : permutations) {
			System.out.print(word + "\t");
		}
	}

	private static List<String> getPermutations(String givenString) {

		//getting permutations of given string
		List<String> permutations = new ArrayList<>();

		for (int i = 0; i < givenString.length(); i++) {
			String temp = swapLetters(givenString, 0, i);
			if (!permutations.contains(temp)) {
				permutations.add(temp);
			}
			swap(temp, permutations);
		}

		return permutations;
	}

	private static void swap(String temp, List<String> permutations) {

		for (int i = 1; i < temp.length() - 1; i++) {
			String result = swapLetters(temp, i, i+1);
			if(!permutations.contains(result)) {
				permutations.add(result);
			}
		}
	}

	private static String swapLetters(String givenString, int oldIndex, int newIndex) {
		
		//swapping two letters
		StringBuilder builder = new StringBuilder(givenString);
		Character oldletter = builder.charAt(oldIndex);
		Character newLetter = builder.charAt(newIndex);
		builder.setCharAt(newIndex, oldletter);
		builder.setCharAt(oldIndex, newLetter);
		
		return builder.toString();
	}

}
