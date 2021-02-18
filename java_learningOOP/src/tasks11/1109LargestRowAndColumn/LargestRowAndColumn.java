package tasks11;

import java.util.ArrayList;

public class LargestRowAndColumn {
	/**
	 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
	 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with
	 * the most 1s. (Hint: Use two ArrayLists to store the row and column indices
	 * with the most 1s.)
	 */

	public LargestRowAndColumn() {

		int[][] matrix = new int[4][4];

		fillMatrix(matrix);

		printMatrix(matrix);

		System.out.printf("Row with most ones is %d.\n",mostOnes(rowIndicies(matrix)));
		
		System.out.printf("Column with most ones is %d.",mostOnes(columnIndicies(matrix)));

	}

	public static void main(String[] args) {

		new LargestRowAndColumn();

	}

	public void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public void fillMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.round(Math.random()));
			}
		}

	}

	public ArrayList<Integer> rowIndicies(int[][] matrix) {

		ArrayList<Integer> row = new ArrayList<Integer>();

		int count = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					count++;
				}

			}
			row.add(count);
			count = 0;
		}

		return row;

	}

	public ArrayList<Integer> columnIndicies(int[][] matrix) {

		ArrayList<Integer> column = new ArrayList<Integer>();

		int count = 0;

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1) {
					count++;
				}

			}
			column.add(count);
			count = 0;
		}

		return column;

	}
	
	public void mostOnes(ArrayList<Integer> array) {
		
		int max = array.get(0), row = 0;
		
		for(int i = 0; i < array.size(); i++) {
			if(max < array.get(i)) {
				row = i;
			}
			
			
		}
		
		
	}

}
