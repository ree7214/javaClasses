package ReplHomwork;

public class Repl82And83_2DArray {

	public static void main(String[] args) {
		/*
		 *  Write a program to double the values of every element in the array
		 *   and print it out.
		 */
		
		/*expected output
		 * 2.8 4.0 6.6 4.0 8.0 3.0 12.2 2.0 2.4 6.2 8.0 3.2
		 */
		
		double[][] a1 = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			double num=0;
			
			for(int i=0; i<a1.length; i++) {
				for (int j = 0; j <a1[i].length; j++) {
					System.out.print(a1 [i][j]*2+" ");
						
					}
				}
			System.out.println();
			
			System.out.println("********************************");
			//Write a program to print the sum of the elements in the third row.
			
			int[][] a = {
					{5,2,3,7},
					{1,5,2,2},
					{1,2,3,4}
				};
			
			int rowTotal=0;
			
			for (int i=0; i<=a.length; i++) {
				rowTotal += a[2][i];
				}
			System.out.println(rowTotal);
	
	
	                  
	
	
	}
	}

