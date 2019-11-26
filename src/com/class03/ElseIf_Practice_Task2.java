package com.class03;

public class ElseIf_Practice_Task2 {

	public static void main(String[] args) {

		int month = 10;

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("Feb");
		} else if (month == 3) {
			System.out.println("Mar");
		} else if (month == 4) {
			System.out.println("Apr");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("Jun");
		} else if (month == 7) {
			System.out.println("Jul");
		} else if (month == 8) {
			System.out.println("Aug");
		} else if (month == 9) {
			System.out.println("Sept");
		} else if (month == 10) {
			System.out.println("Oct...Best Month of the Year!");
		} else if (month == 11) {
			System.out.println("Nov");
		} else if (month == 12) {
			System.out.println("Dec");
		} else {
			System.out.println("I dont know what month this is");
		}

		// Positive or Negative Practice task
		int num2;
		num2 = -2;
		if (num2 > 0) {
			System.out.println(num2 + " Is a positive number ");
		} else {
			System.out.println(num2 + " Is a negative number");
		}
		
		//Even or Odd Practive task
		
		int num3;
		num3=7;
		if(num3%2==0) {
			System.out.println(num3+" is an even number");
		}else {
			System.out.println(num3+" is an odd number");
		}

	}

}
