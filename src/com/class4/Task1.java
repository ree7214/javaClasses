package com.class4;

public class Task1 {
public static void main (String [] args) {
	
	boolean diploma=false;
	double gpa=3.5;
	
	if(diploma) {
		System.out.println("Congratulations!");
		if(gpa>=3.5) {
		System.out.println("You are eligible for a scholarship");	
		}else if(gpa<3.5) {
			System.out.println("You should study harder");
		}
		
	}else {
		System.out.println("Get a degree");
	}
	
	
}
}
