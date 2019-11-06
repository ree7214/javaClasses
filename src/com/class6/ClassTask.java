package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter our birth month");
		int month = scan.nextInt();
		String season;
		

		if (month >= 1 && month <= 3) {
			season = "Winter";

		} else if (month >= 4 && month <= 6) {
			season = "Spring";

		} else if (month >= 7 && month <= 9) {
			season = "Summer";

		} else if (month >= 10 && month <= 12) {
			season = "Fall";

		} else {
			season = "Unknown";

		}
		System.out.println("You were born in the " + season);
	}
}
