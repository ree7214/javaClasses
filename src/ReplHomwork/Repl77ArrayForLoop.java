package ReplHomwork;

import java.util.Scanner;

public class Repl77ArrayForLoop {

	public static void main(String[] args) {
 /*Write a program that creates an array of strings with the size being 7. 
  * Ask the user to input Days of a week beginning with Sunday 
  * using Scanner class.Add these inputs to your array and then 
  * print all values from that array
		 * Hint: you will need 2 for loops but it is not nested loops
		 */
		
		Scanner scan=new Scanner (System.in);
		
		
		 
		 
		

		    System.out.println("Please enter day 1 of the week");
		    String weekDay1=scan.next();
		  
		    System.out.println("Please enter day 2 of the week");
		    String weekDay2=scan.next();
		    
		    System.out.println("Please enter day 3 of the week");
		    String weekDay3=scan.next();
		    
		    System.out.println("Please enter day 4 of the week");
		    String weekDay4=scan.next();
		    
		    System.out.println("Please enter day 5 of the week");
		    String weekDay5=scan.next();
		    
		    System.out.println("Please enter day 6 of the week");
		    String weekDay6=scan.next();
		    
		    System.out.println("Please enter day 7 of the week");
		    String weekDay7=scan.next();
		
		    String[] day=new String[7];
			 day[0]=weekDay1;
			 day[1]=weekDay2;
			 day[2]=weekDay3;
			 day[3]=weekDay4;
			 day[4]=weekDay5;
			 day[5]=weekDay6;
			 day[6]=weekDay7;
		 
			 for(int i=0; i<7; i++) {
				 System.out.println("Please enter day "+i+" of the week");
				 System.out.println(day[i]);
			 }
			 
			

	}

}
