package com.class9;

public class PracticePattern {

	public static void main(String[] args) {
		// * 54321
		// * 54321
		// * 54321
		// * 54321
		// */

		for (int y = 5; y >= 1; y--) {

			for (int z = 5; z >= 1; z--
					) {

				System.out.print(z);
			}

			System.out.println();
		}
		
		System.out.println("*********************************");
		
		
		/*  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		/* 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for (int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("$");
			}
			System.out.println();
			
			
		}
		System.out.println("*****************************************************");
		
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 88888888
		 * 999999999
		 */
		
		for(int c=1; c<=9; c++) {
			for(int d=1; d<=c; d++) {
				System.out.print(c);
				
			}
			System.out.println();
		}
		

		


	}
}
