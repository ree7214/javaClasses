package ReplHomwork;

import java.util.Scanner;

public class Repl102Arrays_Scanner {

	public static void main(String[] args) {
		/*
		 * For you to do: The code provided in your main method will take in five
		 * Strings and save them into an array called arr.
		 *  Print out the first three letters of each element of array, one per line.
		 * 
		 * Note: every element of array is at least 3 letters long.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
			System.out.println(arr[i]);
		}
		//leave above alone!  write your code below
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j].substring(0, 3));
		}
		System.out.println();
	}
	}

