package com.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		/*Scanner is a class in JAVA
		 * It allows us to take an input from a user
		 * Scanner will help us to make a program more interactive
		 * 
		 * 
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter any number");
/*nextInt();--> for numbers
 * nextLine();-->Strings
 * nextDouble();-->double
 * 
 */
int number=scan.nextInt();
System.out.println("entered number is "  +number);

System.out.println("******************");

Scanner input=new Scanner(System.in);
System.out.println("Please enter your name");
String name=input.nextLine();
System.out.println("Good afternoon " +name);


	}

}
