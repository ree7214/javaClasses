package PreviousReplHomwork;

public class Repl_113 {
	/*
	 * For you to do Step 1:create a method "PrintTwice" that should take a String
	 * as a single parameter
	 * 
	 * Step 2:Write the logic for that method print two statements twice
	 * 
	 * Step 3: call the method ONLY once within the main method and pass the String
	 * value as "Don't make me say this twice!"
	 */

	public static void main(String[] args) {
		Repl_113 word = new Repl_113();
		word.PrintTwice(2);
	}

	void PrintTwice(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Don't make me say this twice!");
		}
	}
}