package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are
		// divisible by 3
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
		System.out.print(i+" ");

	}
		System.out.println("*****************************");
		//Create a program that will be asking user to apply for a 
		//cc 10x. when you get "yes" from the user program 
		//should stop asking
		
		Scanner scan = new Scanner (System.in);
		String cc;
		for (int i=1; i<=10; i++) {
			System.out.println("do you want a credit card? ");
			cc=scan.nextLine();
			if(cc.equalsIgnoreCase("Yes")) {
				break;
			}
			
			
		}System.out.println("Have a nice day");
		
	}
}
