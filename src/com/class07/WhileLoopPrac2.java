package com.class07;

public class WhileLoopPrac2 {

	public static void main(String[] args) {
		// print all even numbers from 1-20
		// 1st way
		
		int z=2;
		
		while (z<=20) {
			System.out.println(z);
			z+=2;
		}
		// 2 way using modulus
		System.out.println("*************");
		int q=1;
		
		while (q<=20) {
			
			if(q%2==0) {
				System.out.print(q);
				
			}
			q++;
			
		}
		
		

	}

}
