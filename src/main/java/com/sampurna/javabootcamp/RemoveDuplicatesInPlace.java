/**Remove duplication from array without creating a new array**/

package com.sampurna.javabootcamp;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {

	public static void main(String[] args) {

		Integer[] givenArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		Integer numberOfElements = removeDuplicates(givenArray);
		System.out.println(numberOfElements + " " + Arrays.toString(givenArray));
	}

	private static Integer removeDuplicates(Integer[] givenArray) {

		Integer index = 0;
		for (int i = 0; i < givenArray.length; i++) {
			if (!(givenArray[i] == givenArray[index])) {
				index ++;
				givenArray[index] = givenArray[i];
			}
		}
		return index + 1;
	}

}
