package com.class23;

public class CarTest {

	public static void main(String[] args) {
		Car.make="Toyota";
		Car car1=new Car();
		car1.color="Pink";
		car1.model="Camary";
		car1.doors=4;
		car1.speed=200;
		car1.getDetails();
		
//		Car car2=new Car();
//		car2.color="blue";
//		car2.model="Corola";
//		car2.doors=2;
//		car2.speed=150;
//		car2.getDetails();
//		
//		Car car3=new Car();
//		car3.color="Green";
//		car3.model="Prius";
//		car3.doors=2;
//		car3.speed=150;
//		car3.getDetails();
		
		BetterCar betterCar1=new BetterCar("Corola","White",180,5);
		betterCar1.getDetails();
	
		

	}

}
