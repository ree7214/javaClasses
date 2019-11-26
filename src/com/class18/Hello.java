package com.class18;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Paraguay");
		obj.sayHelloDifferentLanguage("usa");
		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);

	}
	/*create a method that will say hello in different languages based on the 
	 * value that will be pass when a user calls a method.
	 */
	                             //with parameter
	void sayHelloDifferentLanguage(String country) {
		
		
		
		switch(country.toUpperCase()) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("Hola");
			break;
			
			default:
		System.out.println("I do not know how to say hello in your country");
		}
	}
	//method to say name and age
	
	     // method name
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old.");
	}
	//create a method that will check if it is snowing

	void isSnowing(boolean isSnowing) {//method header
		//method body
		if(isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
		
	}
}
