
package com.sampurna.javabootcamp;
import java.util.Arrays;

/**
 * You need to write a Java program to sort an array of integers using a quick
 * sort algorithm
 ****/

public class QuickSort {

	public static void main(String[] args) {

		Integer[] array = { 4, 3, 2, 1 };
		doQuickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void doQuickSort(Integer[] array, Integer low, Integer high) {

		Integer partitionPosition = getPartitionPosition(array, low, high);
		if (partitionPosition != null) {
			doQuickSort(array, low, partitionPosition - 1);
			doQuickSort(array, partitionPosition + 1, high);
		}
	}

	private static Integer getPartitionPosition(Integer[] array, Integer low, Integer high) {

		Integer pivot = array[low];
		Integer i = low, j = high + 1;

		if (high <= 0 || low == high) {
			return null;
		}

		while (i < j) {
			do {
				i++;
			} while (array[i] <= pivot && i < high);

			do {
				j--;
			} while (array[j] > pivot && j > 0);

			if (i < j) {
				swap(array, i, j);
			}
		}
		swap(array, low, j);

		return j;

	}

	private static void swap(Integer[] array, Integer integer1, Integer integer2) {
		Integer temp = array[integer1];
		array[integer1] = array[integer2];
		array[integer2] = temp;
	}
}
