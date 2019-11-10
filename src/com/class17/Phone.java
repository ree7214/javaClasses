package com.class17;

public class Phone {
	
	String make, model,color;
	int year ;
	boolean camera;
	
	void picture() {
		System.out.println("My"+" "+make+" "+model+ " can take pictures");
	} 
	
	void answer() {
		System.out.println("My"+" "+make+" "+model+ " can answer a call");
	}
	
	void search() {
		System.out.println("My"+" "+make+" "+model+ " can search for a phone number");
	}
	public static void main(String []args) {
		
		Phone iPhone=new Phone ();
		
		iPhone.make="Apple";
		iPhone.model="11";
		iPhone.color="black";
		iPhone.year=2019;
		iPhone.camera=true;
		
		
		Phone android=new Phone ();
		
		android.make="android";
		android.model="s1";
		android.color="silver";
		android.year=2020;
		android.camera=true;
		
		Phone nokia=new Phone ();
		
		nokia.make="nokia";
		nokia.model="G4";
		nokia.color="silver";
		nokia.year=2020;
		nokia.camera=true;
		
		iPhone.picture();
		iPhone.answer();
		iPhone.search();
		
		System.out.println("-----------------");
		
		android.picture();
		android.answer();
		android.search();
		
		System.out.println("-----------------");
		
		nokia.picture();
		nokia.answer();
		nokia.search();
		
	}
	
	
	

}
