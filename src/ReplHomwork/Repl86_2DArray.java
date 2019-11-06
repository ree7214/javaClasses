package ReplHomwork;

public class Repl86_2DArray {

	public static void main(String[] args) {
		/*
		 * Write a program that takes a 2-D array and prints the sums of the rows as an
		 * integer array.
		 */

		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		System.out.println(a[0][0]+a[0][1]+a[0][2]);
		System.out.println(a[1][0]+a[1][1]+a[1][2]);
		System.out.println(a[2][0]+a[2][1]+a[2][2]);
		System.out.println(a[3][0]+a[3][1]+a[1][2]);
	}
	}

