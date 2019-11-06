package com.class14;

import java.util.Scanner;

public class JavaInterviewQuestion7And8 {

	public static void main(String[] args) {
		/* Question 7
		 * 
		 * Write a java program to check whether a given number is prime or not?
		 */
		
		  boolean isPrime=true;
		    Scanner scan=new Scanner (System.in);
		    System.out.println("Enter a number");
		    int givenNumber=scan.nextInt();
		    
		    for(int i=2; i<givenNumber; i++) {
		        if(givenNumber%i==0) {
		            isPrime=false;
		        }
		        }
		    if(givenNumber<2) {
		        System.out.println("Number can not be check");
		    }else if (isPrime) {
		        System.out.println(givenNumber+ " is a Prime number");
		    }else {
		        System.out.println(givenNumber+ " is not a Prime Number");
		       }    
		

System.out.println("****************");


        /* Question 8
		 * 
		 * Write a Java Program to print first 10 numbers of Fibonacci series.
		 */
        int a=0; 
        int b=1; 
        
        for(int i=1; i<=10; i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
	}
}
