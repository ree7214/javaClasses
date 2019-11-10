package com.class17;

public class Car {
	
	// define attributes/features/variable
	String make, model,color;
	int year, wheels, windows,speed;
	
	//adding behavior/action in ----> methods();
	
	void drive() {
		System.out.println(make+" can drive");
		
	} 
	
	void start() {
		System.out.println(make+" can start");
	}
	void accelerate () {
		System.out.println("I am accelerate method");
		System.out.println(make+" can accelerate");
	}
	
}
