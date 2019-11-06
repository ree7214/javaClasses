package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/* .split()
		 * This method splits the string around matches of the given regular expression
		 * This method returns one dimentional array
		 */
		
	
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help your prove your point";
		String [] array=str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("********************************");
		//how can we find how many sentences are in the following string 
		String str1="Todday is Sunday. Its a sunny day. and we are having Java class";
				
		String []	array2=	str1.split("\\.");
		System.out.println(array2.length);// tells us how many sentences are in the string.
		
		for (String string:array2) {
			System.out.println(string.trim());
		}
		

	}

}
