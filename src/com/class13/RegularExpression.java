package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		// print only text and not numbers
		
		String str="12345Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", ""));//leave only text
		
		System.out.println(str.replaceAll("[^0-9]", ""));//leave only numbers
		
		System.out.println(str.replaceAll("[a-zA-Z]", ""));// also leave only numbers
		
	
		String str2="Hi$%How*&%$98543";
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));// keeps special characters
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));// removes special characters
		
		
		
	}
	

}
