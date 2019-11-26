package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this(); //<-----used to call current class consturctor
		System.out.println("I am constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str, String str1){
		this(str);
		System.out.println("I am constructor with 2 params");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		System.out.println("---------------------------------------------------");
		//we can execute 2 constructors when creating an object by using this()
		//this type of constructor calls is known as constructor chaninging
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
		
	}

}
