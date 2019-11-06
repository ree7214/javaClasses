package ReplHomwork;

import java.util.Scanner;

public class Repl78Array {

	public static void main(String[] args) {
		/*
		 * For you to do Note: Create Scanner class Write an array with size of 5. Use a
		 * loop to input values to the array (don't print any prompt message for
		 * Scanner). Then print out all the elements you have created in the first loop
		 * in reverse order.
		 */
		
		Scanner scan=new Scanner (System.in);
		int num0=scan.nextInt();
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int num4=scan.nextInt();
		
		int input[]=new int[5];
		
		input[0]=num0;
		input[1]=num1;
		input[2]=num2;
		input[3]=num3;
		input[4]=num4;
		
		
		
		for(int i=input.length-1; i>=0; i--) {
			System.out.println(input[i]);
		}

	}

}
