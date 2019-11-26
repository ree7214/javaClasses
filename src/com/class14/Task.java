package com.class14;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces. 
		 * 
		 * Create a String that should be combination of
		 * letters, numbers and special characters. Find out how many alpha characters
		 * are there in the String.
		 * 
		 *  You have a String a=”Is it saturday? Is it raining?
		 * Do we have a Java Class today?” How would you find out how many sentences are
		 * in that String?
		 */
		String str="Today is a sunny day";
				System.out.println(str.replace(" ", ""));
				
		System.out.println("*********************");	
		
		String str1="Today is the #$%% 15 #$%& Java class";
		
				System.out.println(str1.replaceAll("[^A-z0-9]", "").length());
				
				System.out.println("**********************************");
				
		String str2="Is is saturday? Is it raining? Do we have a Java Class today?";
		String []	array2=	str2.split("\\? ");
		System.out.println(array2.length);
		
		
		
	}

}
