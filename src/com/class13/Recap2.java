package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		//String Literal
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.contentEquals(str2));//true
		System.out.println(str1==str2);// true because only one object is stored 
		
		System.out.println("************************************");
		
		//String by new key word
		String str3 = new String ("Bye");
		String str4 = new String ("Bye");
		
		System.out.println(str3.equals(str4)); // statement is true
		System.out.println(str3==str4);//false because is compares the object
		
		System.out.println("************************************");
		
		System.out.println(str1.contains("zz"));// false because hello does not contain zz
		
		System.out.println("***********StartsWith and EndsWith*************************");
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("************Concat*****************");
		System.out.println(str5.concat(" and we have java class"));
		
		System.out.println("************Trim*****************");
		String str6="    It is sunny    ";
		System.out.println(str6.trim());
		
		System.out.println("************Index Of and CharAt*****************");
		String str7 ="Tomorrow we will be done with String Manipulation";
		
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
	}

}
