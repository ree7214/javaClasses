package com.class7;

import java.util.Scanner;

public class HwTaskEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int price;
		do {System.out.println("Please pay for your coffee");
			price=scan.nextInt();
		}while(price!=5);
		System.out.println("Enjoy your coffee");
	}

}
