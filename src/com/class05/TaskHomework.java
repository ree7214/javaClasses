package com.class05;

import java.util.Scanner;

public class TaskHomework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your quiz score");
		int quiz = scan.nextInt();

		System.out.println("Please enter your midterm score");
		int midterm = scan.nextInt();

		System.out.println("Please enter your final score");
		int finalscore = scan.nextInt();

		int average = (quiz + midterm + finalscore) / 3;
		char grade;
		if (average >= 90) {
			
			System.out.println("A");

		}else if(average>=70 && average <90) {
			
			System.out.print("B");
		}else if(average>=50 && average<70) {
			
			System.out.print("C");
		}else if(average<50) {
			System.out.println("D");
		}else {
			System.out.println("unknown");
		}
		
		}
		
	}

