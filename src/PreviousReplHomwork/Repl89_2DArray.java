package PreviousReplHomwork;

public class Repl89_2DArray {

	public static void main(String[] args) {
		/*
		 * Write a program that sums all numbers that are on even index and on even row
		 * and prints it out.
		 * 
		 * For example, in the following array, the numbers with parentheses would be
		 * summed:
		 * 
		 */

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int sum = 0;
		for (int i = 0; i < a.length; i += 2) {

			for (int j = 0; j < a[i].length; j ++) {
				System.out.print( a[i][j]+" ");
			}
			System.out.println();
		}

		

	}

}
