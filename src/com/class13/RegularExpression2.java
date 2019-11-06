package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		//Replace space with nothing
		
		String str = "Today is our java class";
		
		System.out.println(str.replace(" " , ""));
		
		System.out.println("****************************************");
		
		System.out.println(str.replaceAll("\\s",""));
		

	}

}
