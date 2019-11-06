package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		/* .toCharArry
		 * This method converts this string to a new character array.
		 * 
		 */
		String str="Syntax";
		
		//str.toCharArray();
		//System.out.println(str.toCharArray());
		
		char [] array = str.toCharArray();
		
		for(char i:array) {
			System.out.print(i);
		}
		
		System.out.println("***************************");
		
		

	}

}
