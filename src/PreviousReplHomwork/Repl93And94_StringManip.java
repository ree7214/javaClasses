package PreviousReplHomwork;

public class Repl93And94_StringManip {

	public static void main(String[] args) {
		/*
		 * Repl 93 Validate if the string ends with "u" prints the Boolean value
		 * accordingly. Validate if the string ends with "world" prints the Boolean
		 * value accordingly. Validate if the string ends with "are" prints the Boolean
		 * value accordingly. Validate if the string ends with "you" prints the Boolean
		 * value accordingly.
		 */

		// starts the code from here
		String s1 = "hello how are you";
		System.out.println(s1.contains("u"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));

		System.out.println("*********************************");

		/*Repl 94
		 * Print out the position of the first occurrence of "c". 
		 * Print out the position of the first occurrence of " ". 
		 * Print out the position of the first occurrence of the variable target1. 
		 * Print out the position of the first occurrence of the variable target2.
		 */
		// starts the code from here
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA"; 
		
	    System.out.println(str.indexOf("c"));
	    System.out.println(str.indexOf(" "));
	    System.out.println(str.indexOf(target1));
	    System.out.println(str.indexOf(target2));

	}

}
