package PreviousReplHomwork;

import java.util.Scanner;

public class ReplHw48 {

	public static void main(String[] args) {
		// For you to do:
		// Prompt user to input either "M" or "F" as a String "gender" and input any
		// value as int "age".

		// You have 2 conditions:
		// If age is above 25, your inner condition, depending on your gender value,
		// should get either "Woman" or "Man" as an output.
		// If age is below 25, your inner condition, depending on your gender value,
		// should get either "Girl" or "Boy" as an output.

		// Instruction: after you run your code, start inputing your values without
		// Prompt question to appear.

		// Hint: your age should not be equal to 25.

		String gender;
		int age;
		Scanner scan;

		scan = new Scanner(System.in);
		gender = scan.nextLine();
		age = scan.nextInt();

		/*
		 * if(age>25) { if(gender.equals("M")) { System.out.println("Man"); }else {
		 * System.out.println("Women"); }
		 * 
		 * }else if (age<25) { if(gender.equals("M")) { System.out.println("Boy");
		 * 
		 * }else { System.out.println("Girl"); } }
		 

		if (age > 25 || age < 25) {
			if (age > 25) {
				if (gender.equals("M")) {
					System.out.println("Man");
				} else if (gender.equals("F")) {
					System.out.println("Woman");
				}
			}

			if (age < 25) {
				if (gender.equals("F")) {
					System.out.println("Girl");

				}
				if (gender.equals("M")) {
					System.out.println("Boy");
				}
			}
		}
*/
		
		    int a=30;
		    int b=20;
		    int c=a+b;
		    int d=15;
		    
		    if (a>d&&b>d){
		      System.out.println("true");
		    }
		    
	}

}
