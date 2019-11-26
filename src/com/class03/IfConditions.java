package com.class03;

public class IfConditions {

	public static void main(String[] args) {
	
		int expectedHours=15;
		int actualHours=20;
		
		//if expected hours are more than actual-> you will succed
		//otherwise, please study more
		
		if(actualHours>expectedHours) {
			System.out.println("you will succeed");
			
		}else {
			System.out.println("please study more");
			
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice=2;
		
	
		
	//if price is more than I can afford i will not buy
		//if price is less or matches what I can afford then I will buy tea
		
		if(allowedPrice>=teaPrice) {System.out.println("I will buy  tea");
			
			
		}else {
			System.out.println("I cannot afford, I need to study more");
		}
		
		
	}

}
