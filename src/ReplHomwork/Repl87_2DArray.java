package ReplHomwork;

public class Repl87_2DArray {

	public static void main(String[] args) {
		// Repl 87
		
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2,2},
//				{1,-2,3,-4}
//			};
//
//		int total = 0;
//		for (int row = 0; row < a.length; row++) {
//			for (int column = 0; column < a[row].length; column++) {
//				if (a[row][column] < 0 && a[row][column] % 2 != 0) {
//					total = total + 1;
//				}
//			}
//		}
//		System.out.println(total);
		
		// Repl 88
		
		//Write a program that will print the sum of all elements in column with index 1 in a 2-D int array. 
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int columnSum = 0;
		for(int i=0; i<a.length; i++) {
			columnSum+=a[i][1];
			
		}
		System.out.println(columnSum);

	}

}
