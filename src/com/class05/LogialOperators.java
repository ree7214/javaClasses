package com.class05;

public class LogialOperators {

	public static void main(String[] args) {
		// logical operators: AND, OR, NOT
		/*
		 * AND
		 * if (true AND true)--> true
		 * if (true AND false)--> false
		 * if (false AND true)--> false 
		 *  if (false AND false)--> false
		 */
		
		/* if number is between 1-10 --> this number is small
		 * if number is between 10-100 --> this number is med
		 * if number is between 100-1000 --> this number is large
		 * any other number --> is out of the range
		 * 
		 */
		
		int num=20;
		// true AND false--> false
		if(num>1&&num<10) {
			System.out.println("this number is small");
			
		}else if(num>=10&&num<100) {
			System.out.println("this number is med");
			
		}else if(num>=100&&num<1000) {
			System.out.println("this number is large");
		}else {
			System.out.println("number is out of the range");
		}
		

	}
	
	

}
