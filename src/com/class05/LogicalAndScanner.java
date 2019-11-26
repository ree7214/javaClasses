package com.class05;

import java.util.Scanner;

class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age
		 * if age is 1-3 - your a baby
		 * if age is 3-5 - your a toddler
		 * if age from 5-12  - your a kid
		 * if age from 12-19 - teenager
		 * if age >20 your an adult
		 */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter age");
		int age=scan.nextInt();
		
		
		if(age>1 && age<=3) {
			System.out.println("you are a baby");
		}else if(age>3 && age <=5) {
			System.out.println("you are a toddle");
		}else if (age>5 && age<12) {
			System.out.println("you are a kid");
		}else if (age>12 && age<20) {
			System.out.println("you are a teenager");
		
	}
	
	}

}
