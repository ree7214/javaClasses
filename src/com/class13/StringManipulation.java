package com.class13;

public class StringManipulation {

	public static void main(String[] args) {
		// This method gives you a substring of a string
		
		String str="Java is getting interesting";
		
		System.out.println(str.substring(15));
		
		
		//This method gives you a substring of a string. Starting and ending 
		System.out.println(str.substring(8, 15));
		
		//task2
		
		//Reverse String "sunday" --> "yadnus"
			
		String day = "Sunday";
		//System.out.println(day.charAt(5)+" "+day.charAt(4)+ " "+day.charAt(3));
		
		for (int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
			
			//task3
			System.out.println();
			
		System.out.println("****************************");	
			String str1="Hello";
			
			int middle=str1.length()/2;
			
			if (!str.isEmpty()) {
				if(str1.length()%2!=0 && str1.length()>3) {
					System.out.print(str1.charAt(middle));
					
				}
			}
		}

	}

}
