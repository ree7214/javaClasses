package com.class23;

public class BetterCar {
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors ){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}
	
	public void getDetails() {
		
		System.out.println("I built a "+color+" "+make+" "+model);
		System.out.println("My car has " + doors+" doors and can have speed up to "+speed);
		
	}
	public static void main(String[] args) {
		make="BMW";
		/*compliler will give an error, we have to pass the values
		*when we build an object.
		* Those values will be passed as arguments to the constructor
		* Through the constructor instance vaiables will get initialized.
		* BetterCar bcar1=new BetterCar();
		*/
		BetterCar bcar1=new BetterCar("X5","Blue",400,2);
			
		bcar1.getDetails();	
}
}