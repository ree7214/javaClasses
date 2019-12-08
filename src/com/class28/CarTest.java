package com.class28;

public class CarTest {

	public static void main(String[] args) {
		
		Tesla tesla=new Tesla();
		Tesla tesla1=new Tesla("Tesla", "S5", true);
		tesla1.displayinfo();
		
		Tesla tesla2=new Tesla("Tesla XL", "S8", false);
		tesla2.displayinfo();
		
		

	}
	
	public void helloName(String name) {
		System.out.println("Hello "+name);
	}

}
