package com.class12;

public class StringMiniPulatationDemo {

	public static void main(String[] args) {
		//there are two ways to create objects
		
		//1st way
		//String Literal
		String name="John";
		System.out.println(name);
	
		System.out.println("The length of name is = " +name.length());
		
		
		//2nd way
		//Creating String with new key word
		String name1=new String ("John1");
		
		/*This method returns the length of this string.
		 * the length is equal to the number of 
		 * 16 bit Unicode characters in the string.
		 */
		
		int name1Len=name1.length();
		System.out.println("The length of name is = "+name1Len);
		
		System.out.println("***************************");
		
		String str1="Hello world";
		System.out.println("Before::"+str1);
		str1=str1.toLowerCase();
		System.out.println("After::"+str1);
		
		System.out.println("***************************");
		
		//.equals()
		String str2="HEllo World";
		
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnorCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("*********************");
		
		String str3="Maria";
		System.out.println("Before :: "+str3);
		str3=str3.toLowerCase();
		System.out.println("After::"+str3);
		
	}

}
