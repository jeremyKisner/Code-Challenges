package challenges;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, 
 * your task is to return the total sum of all rooms that are suitable for the CodeBots 
 * (ie: add up all the values that don't appear below a 0).
 */

public class MatrixElementsSum {

	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 1, 0},
		                  {0, 5, 0, 1}, 
		                  {2, 1, 3, 10}};
		matrixElementsSum(matrix);
	}
	
	static int matrixElementsSum(int[][] matrix) {
		int roomPriceSum = 0;
		Set<Integer> columnsToSkip = new LinkedHashSet<Integer>();
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (columnsToSkip.contains(column)) continue;
				if (matrix[row][column] == 0) columnsToSkip.add(column);
				System.out.println(matrix[row][column]);
				roomPriceSum += matrix[row][column];
			}
		}
		System.out.println(roomPriceSum);
		return roomPriceSum;
	}
}
