package com.class5;

public class LogicalNot2 {

	public static void main(String[] args) {
		// using ! we are reverting the condition

		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = !false;

		if (!traffic) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}

		// lets compare 2 numbers using NOT operator

		int num1 = 10;
		int num2 = 10;

		if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("numbers are NOT equal");
		}
		if (!(num1 == num2)) {
			System.out.println("numbers are NOt equal");
		} else {
			System.out.println("numbers are equal");
		}

		String name = "Mary";
		String name2 = "Anna";
		
		// if name is not Marry or Anna then you are not my sister
		
		
		
		if (!(name.equals("Mary") || name2.equals("Anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister");
		}

	}

}
