package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to remove duplicates from an array in Java without using the
 * Java Collection API. The array can be an array of String, Integer or
 * Character, your solution should be independent of the type of array
 ****/

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		Integer[] givenArray = { 1, 2, 3, 4, 5, 5, 4 };
		List<Integer> uniqueList = new ArrayList<>();
		uniqueList = removeDuplicatesFromArray(givenArray);
		System.out.println(uniqueList);
	}

	public static List<Integer> removeDuplicatesFromArray(Integer[] givenArray) {
		
		List<Integer> uniqueList = new ArrayList<>();

		//removing duplicates from given array without using Java Collection API
		for (int i = 0; i < givenArray.length; i++) {
			Integer counter = 0;
			while (counter.equals(0)) {
				for (int j = 0; j < givenArray.length; j++) {
					if (i != j) {
						if (givenArray[i].equals(givenArray[j])) {
							counter++;
							break;
						}
					}
				}
				if (counter == 0) {
					uniqueList.add(givenArray[i]);    //adding unique values to list
					break;
				}
			}
		}
		return uniqueList;
	}

}
