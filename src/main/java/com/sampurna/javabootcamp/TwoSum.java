/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] givenArray = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = getTwoSumNumbers(givenArray, target);
		System.out.println("Positions of numbers whose sum is 9 :" + Arrays.toString(result));
	}

	public static int[] getTwoSumNumbers(int[] givenArray, int target) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> numberPositions = new HashMap<>();

		for (int i = 0; i < givenArray.length; i++) {
			if (numberPositions.size() == 0 || !(numberPositions.containsKey(target - givenArray[i]))) {
				numberPositions.put(givenArray[i], i);
			} else {
				result.add(i);
				result.add(numberPositions.get(target - givenArray[i]));
				Collections.sort(result);
				return result.stream().mapToInt(Integer::intValue).toArray();

			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
