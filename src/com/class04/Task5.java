package com.class04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("What is the temperature");
		int temp=scan.nextInt();
		
		System.out.println("What city do you live in");
		String city=scan.next();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperater in city " +city+ " is " + convertedTemp);
	}

}
