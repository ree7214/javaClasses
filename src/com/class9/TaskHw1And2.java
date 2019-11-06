package com.class9;

public class TaskHw1And2 {

	public static void main(String[] args) {
		/* 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */
		
		for(int a=5; a>=1; a--) {//rows
			for(int b=1; b<=a; b++) {//columns
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		
		/*  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
					System.out.println();
			
}
				for(int b=4; b>=1; b--) {
					for (int c=1; c<=b; c++) {
						System.out.print("*");
					}
					System.out.println();
				}
		}
	
	}


	
	

		
