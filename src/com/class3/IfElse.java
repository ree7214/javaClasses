package com.class3;

public class IfElse {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("num1 is larger than num2");

		} else if (num1 == num2) {
			System.out.println("num1 is equal to num2");
		} else {
			System.out.println("num1 is smaller than num2");
		}

		int day = 6;
		if (day == 1) {
			System.out.println("Today is Monday. I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tue. I have SDLC class ");

		} else if (day == 3) {
			System.out.println("Today is Wed. I have Java Reiew class ");
		} else if (day == 4) {
			System.out.println("Today is Thur. I have SDL Reiew class ");
		} else if (day == 5) {
			System.out.println("Today is Fri. I off from class ");

		} else if (day == 6) {
			System.out.println("Today is Sat. My favorite coding class ");
		} else if (day == 7) {
			System.out.println("Today is Sun. I love spending Sundays at Syntax ");
		}else {
			System.out.println("I dont know what day this is");
			
		}

	}

}
