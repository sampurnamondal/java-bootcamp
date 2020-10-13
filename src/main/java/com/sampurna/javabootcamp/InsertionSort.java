package com.sampurna.javabootcamp;
import java.util.Arrays;

/*** Write a program to implement the insertion sort algorithm in Java ***/

public class InsertionSort {

	public static void main(String[] args) {

		Integer[] array = { 4, 3, 2, 1 };
		Integer[] sortedArray = doInsertionSort(array);
		
		if (sortedArray != null) {
			System.out.println(Arrays.toString(sortedArray));
		} else {
			System.out.println("Invalid or empty array given");
		}
	}

	private static Integer[] doInsertionSort(Integer[] array) {

		if (array == null || array.length == 0) {
			return null;

		}

		//performing insertion sort
		for (int i = 1; i < array.length; i++) {

			Integer temp = array[i];
			int j = i;

			while (j > 0 && temp < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		return array;
	}
}
