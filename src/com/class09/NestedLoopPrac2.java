package com.class09;

public class NestedLoopPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<=6; j++) {
				System.out.print("*");
		}
			System.out.println();
		}

		System.out.println("*****************************************************");
		// print
		
		
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		for(int k=1; k<5; k++) {
			for(int l=1; l<6; l++) {
				System.out.print(l);
			}
			System.out.println();
			
		}
		System.out.println("*******************************************************");
		
		for (int m=1; m<=5; m++) {
			for (int n=1; n<=5; n++) {
				System.out.print(m);
			}
			
			System.out.println();
		}
		
		System.out.println("**********************************************************");
		
		/* 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for(int y=5; y>=1; y--) {
			for(int z=5; z>=1; z--) {
				System.out.print(z);	
		}
		
			System.out.println();
			
			System.out.println("*******************************************************");
			
			
			/* 55555
			 * 44444
			 * 33333
			 * 22222
			 * 11111
			 */
			for(int w=5; w>=1; w--) {
				for(int x=5; x>=1; x--) {
					System.out.print(w);	
			}
			
				System.out.println();
			
		}
		
		
	}
	}
}

	


