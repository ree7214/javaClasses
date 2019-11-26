package com.class04;

public class Task4_Practice {
	public static void main(String[] args) {

		boolean diploma = false;
		double gpa = 2.5;

		if (diploma) {
			System.out.println("Congrats");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else if (gpa < 3.5) {
				System.out.println("You are not eligible for a sholarship. You should have studied harder");
			}
		} else {
			System.out.println("You do not have a diploma");
		}
		{
			int price = 200000;
			double rate = 4.5;

			if (rate > 4.5) {
				System.out.println("I will not buy the house");
				
			}else {
				System.out.println("I will buy the house");
				if(price>=200000) {
					System.out.println("I will need to take a loan");
							}else if(price<=200000) {
								System.out.println("I will pay cash for the house");
							}

			}

		}

	}
}
