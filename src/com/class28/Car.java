package com.class28;

public class Car {
	
	String make, model;
	
	Car(){
		System.out.println("I am a non argument constructor");
	}
	
	Car(String make, String model){
		this.make=make;
		this.model=model;
		
	}

}
class Tesla extends Car {
	
	boolean autopilot;
	
	Tesla(){
		//super(); complier will add by default to make a call to super class
		//constructor will initialize the objects
	System.out.println("I am a child non argument constructor");	
	}
	Tesla(String make, String model, boolean autopilot){
		super(make, model);//constructor call
		this.autopilot=autopilot;
	}
	public void displayinfo() {
		System.out.println("Car "+ make+"  "+model+" "+ " has an autopilot "+autopilot);
	}
}