package com.class09;

import java.util.Scanner;

public class Task3Example2 {

	public static void main(String[] args) {
		
		/* Write a program that reads a range of integers (start and 
		 * end point), provided by a user and then from that range 
		 * prints the sum of the even and odd integers.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number");
		int start = scan.nextInt();
		System.out.println("Enter end number");
		int end = scan.nextInt();
		int even = 0;
		int odd = 0;
		
		if (start < end) {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even = even + i;
				} else {
					odd = odd + i;
				}
			}
			System.out.println("The sum of even numbers is " + even);
			System.out.println("The sum of odd numbers is " + odd);
			
		} else {//if 1num >2 num 
			System.out.println("Please enter start# less then end number");
		}

	}

}
