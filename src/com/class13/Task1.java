package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter your class day:: ");
		String day=scan.nextLine();
		
		if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if(day.equalsIgnoreCase("Tuesday")) {
			System.out.println("Tuesday is your SDLC Class");
		}else if(day.equalsIgnoreCase("Thursday")) {
			System.out.println("Thursday is your Manual Testing Class");
				
			}else {
				System.out.println("Envalid Entry! Please enter a valid class day");
			}
		scan.close();
		

	}

}
