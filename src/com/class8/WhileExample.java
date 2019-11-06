package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// ask user to enter if it is raining
		//if rain keep asking
		// if not tell user --> you can go to the park
		
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining? ");
			isRain=scan.nextBoolean();
			
		}while(isRain);
		System.out.println("Go to the park");

	}

}
