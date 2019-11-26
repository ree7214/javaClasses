package com.class23;

public class ConsturctorDemo {

	ConsturctorDemo(){
		System.out.println("I am your constructor");
	}
	
	ConsturctorDemo(String str){
		System.out.println("I am constructor with 1 paramater "+str);
	}
	
	ConsturctorDemo(int num, int num1){
		System.out.println("I am constructor with 1 paramater "+num);
	}
	
	public static void main(String[] args) {
		//creating obj               constructor
		ConsturctorDemo obj=new  ConsturctorDemo();
		System.out.println("Code after creating an Object");
		obj.hello("Hello");
		
	//	ConsturctorDemo obj2=new  ConsturctorDemo("My Parameter");
		ConsturctorDemo obj2=new  ConsturctorDemo(123,345);

	} 
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	public void hello(String str) {
		System.out.println("Hello Class1");
		System.out.println("Hello Instructors1");
	}
}
