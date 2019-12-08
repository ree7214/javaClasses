package com.class30;

public interface Drivable {
	
	// by default compiler will add public static final variables
	boolean DRIVE_FAST=true;// constant varialbes are written using upper case
	
	// by default compiler will add public and abstract methods
	void drive();
}
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing brakes");
	}
}
class Toyota extends Cars implements Drivable{//multilevel inheritance -- two parents

	@Override
	public void drive() {
		System.out.println("Toyota can drive");
		
	}
	
}
