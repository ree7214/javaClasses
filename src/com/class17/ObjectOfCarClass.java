package com.class17;

public class ObjectOfCarClass {
	public static void main (String [] args) {
	// to create an object snytax is
	// ClassName variable=new ClassName();
	
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		//accessing behavior for 1st object
		car1.drive();
		car1.start();
		car1.accelerate();
		
		System.out.println("----------------------");
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		//accessing behavior for 2st object
		car2.drive();
		car2.start();
		car2.accelerate();
		
		System.out.println("----------------------");
		
		//print feature of the car
		//I have a black Tesla
		
		System.out.println("I have a "+car1.color+" "+car1.make);
		
		//Print I drive a bmw 2019
		
		System.out.println("I drive a "+car2.make+" "+car2.year);
		
		
	
	}
}
