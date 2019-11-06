package ReplHomwork;

import java.util.Scanner;

public class Repl103_CharScannerArray {

	public static void main(String[] args) {
		// Write a for loop that will loop through every character of a word and print out each character, each on a separate line
		
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    
	    char[] array= word.toCharArray();
	      
	       for(char c: array){
	           System.out.println(c);

	}
	}
}
