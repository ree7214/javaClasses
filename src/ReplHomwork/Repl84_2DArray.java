package ReplHomwork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl84_2DArray {

	public static void main(String[] args) {
		// Write a program that prints the highest value in the array.

		int[][] a = { { 5, 2, 3, 7 }, 
				      { 1, 5, 1, 1 }, 
				      { 8, 3, 1, 2 } };
		/*
		 * for (int array[]:a) { for(int i=0; i<=Array.getLength(a); i++) {
		 * if(array[i]>=8) { System.out.println(array[i]); } System.out.println(); } }
		 */
		
		
	// TO FIND LARGEST NUMBER
		
		int max = Integer.MIN_VALUE;
		{
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] > max) {
						max = a[i][j];
					}

				}
			}
		}
		System.out.println(max);

	// TO FIND SMALLEST NUMBER
	
		int min = Integer.MAX_VALUE;
		{
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] < min) {
						min = a[i][j];
					}

				}
			}
		}
		System.out.println(min);

	
	
	
	
	
	}
}
