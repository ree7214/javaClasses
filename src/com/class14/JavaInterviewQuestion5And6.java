package com.class14;

public class JavaInterviewQuestion5And6 {
	public static void main(String[] args) {
		/*
		 * question 5 Write a java program to reverse String? Reverse a string word by
		 * word?
		 */
		String input = "Today is a wonderful day";

		// converting String to character array
		// by using toCharArray

		int length = input.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);

//	    StringBuilder sb = new StringBuilder(input); <----USING STRING BUILDER FOR SAME RESULT
//	    sb.reverse();
//	    System.out.println(sb);
//	    
		System.out.println("***************************");

		// question 6

		/*
		 * Write a Java Program to find whether a String is palindrome or not?
		 */

		String input1 = "anna";
		String forward = "";
		int word = input1.length();
		for (int i = 0; i <=word - 1; i++) {
			forward = forward + input1.charAt(i);
		}
		System.out.println(forward);
		
		String input2 = "ana";
		String reverse1 = "";
		int word1 = input2.length();
		for (int i = word1-1; i >= 0; i--) {
			reverse1 = reverse1 + input2.charAt(i);
		}
		System.out.println(reverse1);
		
		
		if(reverse1.equals(forward)) {
			System.out.println("This is a palindrome string");
		}else {
			System.out.println("This is not a palindrome string");
		}

	}
}
