package ReplHomwork;

import java.util.Scanner;

public class Repl80Array {

	public static void main(String[] args) {

		/*
		 * Note: Create a Scanner Class
		 * 
		 * Create an int array with the size of 5 and input values with Scanner. Create
		 * a loop and enter values into one loop (don't print prompt question for
		 * Scanner). Create the second loop to print the values and it must be
		 * multiplied by 10. Print out each element of the array multiplied by ten, one
		 * element per line.
		 * 
		 * Example: Input: 1 2 3 4 5
		 * 
		 * Output: 10 20 30 40 50
		 */

		Scanner scan = new Scanner(System.in);
		int num0 = scan.nextInt();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		int input[] = new int[5];

		input[0] = num0;
		input[1] = num1;
		input[2] = num2;
		input[3] = num3;
		input[4] = num4;

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i] * 10);
		}

	}

}
