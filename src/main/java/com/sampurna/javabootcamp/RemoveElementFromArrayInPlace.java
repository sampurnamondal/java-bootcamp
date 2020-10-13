/**Remove elements from array without creating a new array**/

package com.sampurna.javabootcamp;

import java.util.Arrays;

public class RemoveElementFromArrayInPlace {

	public static void main(String[] args) {

		Integer[] givenArray = { 3, 2, 2, 3 };
		Integer value = 2;
		Integer arraySizeLeft = removeElement(givenArray, value);
		System.out.println(arraySizeLeft + " " + Arrays.toString(givenArray));
	}

	private static Integer removeElement(Integer[] givenArray, Integer value) {

		// return Arrays.stream(givenArray).filter(x -> x != value).toArray().length;
		Integer index = 0;
		if (!(givenArray == null || givenArray.length == 0)) {
			for (Integer number : givenArray) {
				if (number != value) {
					givenArray[index] = number;
					index++;
				}
			}
		}
		return index;
	}
}
