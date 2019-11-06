package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal to =5;
		 * After user paid then say "Enjoy your coffee!"
		 */
		
		
		//sidenote: review "for" loop before class tomorrow
		
		
		Scanner scan=new Scanner (System.in);
		
		Boolean coffee;
		int price=1;	
		while(price<=5) {
			System.out.println("Please pay for coffee");
			coffee=scan.nextBoolean();
			price++;
			if(price>5) {
				System.out.println("Please enjoy your coffee");
				price++;
			}
		}
		
	}

}
