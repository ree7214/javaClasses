package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
	int temp1=42;
	
		
	if (temp1<32) {
		System.out.println("If the temp is less than 32 degrees the water will freeze");
	}	else {
		System.out.println("If the temp is more than 32 degrees the water will not freeze");
		
		

	}
		int tempCheck=60;
		if(tempCheck<32) {
	System.out.println("Water will freeze with a temp of "+tempCheck);
	
			
		}else {
			System.out.println("Water will not freeze with a temp of "+tempCheck);
			
		}
			

	}

}
