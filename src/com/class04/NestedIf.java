package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// Nested if is an if statement inside an if statement

		// (boolean expresion)

		boolean b = true;
		boolean classToday = true;

		if (b) {

			System.out.println("hello");
			if (classToday) {
				System.out.println("hello my friends");
			}
		} else {
			System.out.println("Bye");

		}

		System.out.println("I am continues code");
	}

	/*check age, if age is less than 16--> you are too young to drive
	 * otherwise we will check if you are older than 18-->you can get driver license
	 * if not --> you can get a driver permit
	 */
	{

		
int age=18;
if(age<16) {
	
	System.out.println("you are too youngto drive");
	
}else {
	System.out.println("you are eligible to drive");
	if(age>18){
		System.out.println("you can drive alone");
	}else {
		System.out.println("you need your parents to drive");
	}
}
}
}






