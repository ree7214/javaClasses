package com.class12;

public class StringMiniPulatationDemo2 {
	public static void main (String [] args) {
	
	/*
	 * .contains();
	 * This method searches the sequence of characters in the string.
	 * if the sequence of characters are found,
	 * then it returns true otherwise returns false.
	 */
	String sentence="It was raining";
	System.out.println(sentence.contains("was"));
	
	System.out.println("************************************************");
	
	//Create two Strings and initialize them with some value.
	//implement the following methods on those strings
	
	  /*
     * sen.length();
     * sen.equals();
     * sen.contains(s);
     * 
     * sen.toUpperCase();
     * sen.toLowerCase();
     * sen.equalsIgnoreCase(anotherString);
     */
	
	String name="Mike";
	System.out.println(name);

	System.out.println("The length of name is = " +name.length());
	System.out.println("************************************************");  
	
	String str1="Maria";
	System.out.println("Before :: "+str1);
	str1=str1.toLowerCase();
	System.out.println("After::"+str1);
	
	System.out.println("************************************************");  
	
	
	
	
	
	
	
	}	
}
