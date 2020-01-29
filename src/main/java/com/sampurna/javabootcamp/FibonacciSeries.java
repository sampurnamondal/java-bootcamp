package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5
 * 8 13 ... . up to a given number (8). We prepare for cross questions like
 * using iteration over recursion and how to optimize the solution using caching
 * and memoization.
 */

public class FibonacciSeries {

	public static void main(String args[]) {

		Integer numberOfElements = 8;
		List<Integer> fibonacciNumbers = findFibonacciNumbers(numberOfElements);

		System.out.println(fibonacciNumbers);
	}

	public static List<Integer> findFibonacciNumbers(Integer count) {

		List<Integer> fibonacciNumbers = new ArrayList<Integer>();
		// calculate the numbers
		fibonacciNumbers.add(1);
		fibonacciNumbers.add(1);

		Integer sum = 0;
		for (int i = 0; i < count - 2; i++) {

			sum = fibonacciNumbers.get(i) + fibonacciNumbers.get(i + 1);
			fibonacciNumbers.add(sum);
		}

		return fibonacciNumbers;
	}
}
