package com.sampurna.javabootcamp;

/*** Do binary search ****/

public class BinarySearch {

	public static void main(String[] args) {

		Integer[] givenArray = { 1, 2, 3, 4, 5, 6, 7 };
		Integer numberToBeSearched = 5;

		Integer position = doBinarySearch(givenArray, 0, givenArray.length - 1, numberToBeSearched);
		if (position == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + position);

	}

	private static Integer doBinarySearch(Integer[] givenArray, int low, int high, Integer numberToBeSearched) {

		Integer mid = (low + high) / 2;

		if (givenArray[mid] == numberToBeSearched) {
			/* return position if number to be searched matched middle of given array */
			return mid;
		} else if (givenArray[mid] > numberToBeSearched) {
			/* search in between lowest position in the given array */
			return doBinarySearch(givenArray, low, mid - 1, numberToBeSearched);
		} else if (givenArray[mid] < numberToBeSearched) {
			/*
			 * search in between one position more that middle and highest position in the
			 * given array
			 */
			return doBinarySearch(givenArray, mid + 1, high, numberToBeSearched);
		} else {
			return -1;
		}

	}
}
