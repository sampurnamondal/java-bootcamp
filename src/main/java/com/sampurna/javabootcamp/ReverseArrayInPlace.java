package com.sampurna.javabootcamp;
import java.util.Arrays;

/*** Reverse array in place ****/

public class ReverseArrayInPlace {

	public static void main(String[] args) {

		Integer[] givenArray = { 1, 2, 3, 4, 5 };
		Integer[] reverse = getReversedArray(givenArray);
		if (reverse != null) {
			System.out.println(Arrays.toString(reverse));
		} else {
			System.out.println("Invalid or empty array given");
		}

	}

	private static Integer[] getReversedArray(Integer[] givenArray) {

		if (givenArray == null || givenArray.length == 0) {
			return null;
		}

		//reversing array in place
		for (int i = 0; i < givenArray.length / 2; i++) {
			Integer temp = givenArray[i];
			givenArray[i] = givenArray[givenArray.length - (i + 1)];
			givenArray[givenArray.length - (i + 1)] = temp;
		}

		return givenArray;
	}
	
	

}
