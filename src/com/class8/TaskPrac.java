package com.class8;

public class TaskPrac {

	public static void main(String[] args) {
		
		//write a code to find the sum of even & odd numbers
		// from range 1 to 20
		//expecting 2 outputs
		//sum for odd nums=....
		//sum for even nums=..
		
	
				int sumEven=0;
				int sumOdd=0;
				
				for (int i=1; i<=20; i++) {
					if(i%2==0) {
						sumEven=sumEven+i;
					}else {
						sumOdd=sumOdd+i;
					}
				}
				System.out.println("sum of even numbers equal "+sumEven);
				System.out.println("sum of odd numbers equal " +sumOdd);

	}

}
