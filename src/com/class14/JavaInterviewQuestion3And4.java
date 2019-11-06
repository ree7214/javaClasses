package com.class14;

public class JavaInterviewQuestion3And4 {

	public static void main(String[] args) {
		/* question 3
		 * find out how many alpha characters present in a string?
		 */
		
		String str1="Today is the #$%% 15 #$%& Java class";
		
		System.out.println(str1.replaceAll("[^A-z0-9]", "").length());
		
		//question 4
		/*
		 * How to find out the part of thes tring from a string? What is substring? Find number of words in string?
		 */
		
		System.out.println("*****************");
		
		
		String str2="Today is Java class";
	      String[]array=str2.split(" ");
	 for (String string : array) {
	    System.out.println(string);
	    
	}
	        System.out.println(array.length);
	}
	
	

}
