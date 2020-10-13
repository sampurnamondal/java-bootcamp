package com.sampurna.javabootcamp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sampurna.javabootcamp.TwoSum;

public class TwoSumTest {

	@Test
	public void testGetTwoSumNumbers() {

		int[] givenArray = { 2, 7, 11, 15 };
		int target = 9;
		int[] actual = { 0, 1 };

		int[] expected = TwoSum.getTwoSumNumbers(givenArray, target);

		assertArrayEquals(expected, actual);
	}

}
