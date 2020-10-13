package com.sampurna.javabootcamp;
/** Transpose a matrix **/

public class TransposeOfMatrix {

	public static void main(String[] args) {

		Integer[][] array = new Integer[2][2];
		array[0][0] = 1;
		array[0][1] = 2;
		array[1][0] = 3;
		array[1][1] = 4;

		Integer[][] transpose = getTransposeOfMatrix(array);
		printMatrix(transpose);
	}

	private static void printMatrix(Integer[][] transpose) {
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static Integer[][] getTransposeOfMatrix(Integer[][] array) {

		Integer[][] transpose = new Integer[2][2];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					transpose[i][j] = array[i][j];
				} else {
					transpose[i][j] = array[j][i];
				}
			}
		}

		return transpose;
	}

}
