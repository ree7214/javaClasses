package com.class12;

public class StringMinipulationDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="";
		System.out.println("Is this string empty = "+str.isEmpty());
		String str1="Hello";
		System.out.println("Is this string empty = "+str1);
		
		System.out.println();
		                                                             //\n moves to new line
		String sentence="It is raining now. But the sun will come out \n and get very bright and warm outside";
		System.out.println(sentence);
		
		System.out.println("****************************");
		
		String str3="Hello";
		String str4=" world";
		String str5=" people";
		System.out.println(str3.concat(str4+str5));
		
		System.out.println("****************************");
		
		//Trim method
		/*
		 * This method returns a copy of the string.
		 * with leading and trailing whitespace omited
		 */
		
		String str6="   How are you?   ";
		System.out.println(str6.trim());
		
		System.out.println("****************************");
		
			//Char Index method
		
		/*This method returns the character located at the String's specified index.
		 * the string indexes start from zero
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(3));
		
		System.out.println("****************************");
		
		/*This method returns the index within the string of the first occurance of the 
		 * specified character or if the character does not occur
		 */
		String str8="We might not be done early today";
		System.out.println(str8.indexOf('m'));
		
		
		

	}

}
