package com.class9;

import java.util.Scanner;

public class TaskHw4 {

	public static void main(String[] args) {
		
		/* Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display �Congratulations!!. You got it!�
		 */
		
	     int i = 1;
	        int number1 = 12;
	        
	       Scanner scan=new Scanner (System.in); 
	        
	        do {
	            System.out.println("Please guess the number ");
	            int number = scan.nextInt();
	            if (number > number1) {
	                System.out.println("Number is too large");
	            } else if (number < number1) {
	                System.out.println("Number is too small");
	            } else {
	                System.out.println("Congratulations!");
	                break;
	            }
	            }while (i <= 20);

	}

}
