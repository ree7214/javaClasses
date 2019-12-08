package PreviousReplHomwork;

import java.util.Scanner;

public class Repl104ScannerArray {

	public static void main(String[] args) {
		/*
		 * Write a for loop that will print out every other letter in a String, starting with the first letter.  
		 * These letters should be printed all on one line with no space in between.
		 */
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		   char [] a=word.toCharArray();
		    	for(int i=0; i<a.length; i+=2) {
		    		System.out.println(a[i]);
		    	}
		  
		    
	}

}
