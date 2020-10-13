package com.sampurna.javabootcamp;

/**** Adding two matrices in Java ***/

public class MatrixAddition {

	public static void main(String[] args) {

		Integer[][] array1 = new Integer[2][2];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1][0] = 3;
		array1[1][1] = 4;

		Integer[][] array2 = new Integer[2][2];
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;

		Integer[][] result = getAddition(array1, array2);

		if (result != null) {
			printMatrix(result);
		} else {
			System.out.println("Invalid matrix given");
		}
	}

	private static void printMatrix(Integer[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static Integer[][] getAddition(Integer[][] array1, Integer[][] array2) {

		// addition of matrix only possible if number of columns and rows of both
		// matrices is equal

		if (array1.length != array2.length) {
			for (int i = 0; i < array1.length && i < array2.length; i++) {
				if (array1[i].length != array2[i].length)
					return null;
			}
			return null;
		}

		Integer[][] result = new Integer[array1.length][array1[0].length];

		for (int i = 0; i < array1.length && i < array2.length; i++) {
			for (int j = 0; j < array1[i].length && j < array2[i].length; j++) {
				result[i][j] = array1[i][j] + array2[i][j];
			}
		}

		return result;
	}

}
