package PreviousReplHomwork;

import java.util.Scanner;

public class ReplHw40 {

	public static void main(String[] args) {
		//For you to do:
		//Write a program using the switch statement  
		//Let us consider the scenario regarding the born baby age 

		//First Output: "enter the age of the Child"

		//case 1: if age is 1 print as "You can Crawl"

		//case 2 : if age is 2 print as  "You can Talk"

		//case 3: If age is 3 print as "You can Dance"

		//case 4: if age is 4 print as "You can get  Trouble"

		//Other than this age (1-4) it should print "I don't know how old you are" 
		
		
		int num;
		String age;
		Scanner scan;
		
		System.out.println("enter the age of the Child");
		scan=new Scanner (System.in);
		
		num=scan.nextInt();
		
		switch(num) {
		case 1:
			age="You can Crawl";
			break;
			
		case 2:
			age="You can Talk";
			break;
			
		case 3:
			age="You can Dance";
			break;
			
		case 4:
			age="You can get Trouble";
			break;
			
			default:
				age="I don't know how old you are";
				
		
			
		}
		System.out.println(age);
	

	}

}
