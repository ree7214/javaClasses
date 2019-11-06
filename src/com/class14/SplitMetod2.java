package com.class14;

import java.lang.reflect.Array;

public class SplitMetod2 {

	public static void main(String[] args) {
		/*
		 * how to separate comma delimited string
		 */
		
		String str="if you come to class early, you can study more, "
				+ "also you can learn more, and leave early";
		
		String []array = str.split(",");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("********************");
		
		String str1="Welcome To Syntax Technologies";
		String [] array2 = str1.split(" ", 2);
		System.out.println(array.length);
		
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
