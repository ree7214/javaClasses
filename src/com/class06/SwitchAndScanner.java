package com.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/*Ask user to enter their gender F or M
		 * based on the input provide 
		 * if F--> Female
		 * if M--> Male
		 * otherwise --> Unknown
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your gender: F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch(gender) {
		case 'F':
		userGender="Female";
		break;
		
		case 'M':
			userGender="Male";
			break;
			
			default:
				userGender="unkown";
				
		
		}System.out.println("Your gender is "+userGender);
		
		

		
	}

}
