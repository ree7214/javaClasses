package com.class23;

public class Car {
	
	/*
	 * We want to build Toyota cars that will have different models and colors
	 */
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {
		
		System.out.println("I built "+color+" "+make+" "+model);
		System.out.println("My car has " + doors+ " doors and can have speed up to "+speed);
		
	}

}