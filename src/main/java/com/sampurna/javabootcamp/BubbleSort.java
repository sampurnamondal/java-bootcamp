
package com.sampurna.javabootcamp;
import java.util.Arrays;

/*** Write a program to implement the bubble sort algorithm in Java. ****/

public class BubbleSort {

	public static void main(String[] args) {

		Integer[] array = {4,3,2,1, 5, 10};
		Integer[] sortedArray = doBubbleSort(array);
		if (sortedArray != null) {
			System.out.println(Arrays.toString(sortedArray));
		} else {
			System.out.println("Invalid or empty array given.");
		}
	}

	private static Integer[] doBubbleSort(Integer[] array) {

		if (array == null || array.length == 0) {
			return null;

		}

		//performing bubble sort
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					Integer temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
