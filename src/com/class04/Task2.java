package com.class04;

public class Task2 {

	public static void main(String[] args) {
	double mortRate;
	int mortPrice;
	mortRate=4.5;
	mortPrice=200000;
	
	
	if (mortRate>4.5) {
		System.out.println("User will not buy house" );
	}else {
		System.out.println("User will buy house");
		if(mortPrice>200000) {
			System.out.println("User will take loan");
		}else {
			System.out.println("User will pay cash");
		}
	}		

	}

}
