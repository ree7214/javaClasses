package com.class25_1;

public class ConstructorsOverloading {
	//different amount of parameters
	ConstructorsOverloading(){
		System.out.println("I am non-argument constructor");
	}
	ConstructorsOverloading(String str){
		System.out.println("I am a constructor with 1 String param ");
	}
	//having different type of parameters
	ConstructorsOverloading(int num){
		System.out.println("I am a constructor with 1 int param ");
	}
	

}
