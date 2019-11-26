package com.class08;

public class Task1 {

	public static void main(String[] args) {
		// print number from 1-100 in 1 line
		
		for(int i=1; i<=100; i++) {
			System.out.print(i);
		}
		System.out.println("******************");
		//Print numbers from 100 to 1
		
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("******************");
		//Print even numbers from 20 to 1 

		for(int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		System.out.println("******************");
		//Print odd numbers between 20 & 50 
		for(int i=21; i<50; i+=2) {
			System.out.println(i);
		}
		System.out.println("******************");
	
		int sum =0;
		for(int i = 1; i <=5; i++) {
			sum = sum + i;
			System.out.print(sum+ "+");
		}
		System.out.println(sum);
		
	}
	//
	

}
