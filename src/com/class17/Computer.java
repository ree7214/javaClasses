package com.class17;

public class Computer {
	// define attributes/features/variable
	String name, brand,monitor, mouse;
	int screen, memory, size, ram;
	boolean keyboard;
	
	//define behavior, ations
	
	void playGames() {//method header
		//method body
		System.out.println("I can play on my "+name);
	}
	void javaCoding() {
		System.out.println("I can do Java coding on my "+name);
	}
	void watchMovie() {
		System.out.println("I can watch a movie on my "+name);
	}
	// using main method for coding
	public static void main (String [] args) {
		
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();
		////////////////////////////////
		System.out.println("-----Creatin 2 object of computer type------");
		
		Computer comp2=new Computer();
		comp2.brand="Dell";
		comp2.name="420";
		comp2.memory=125;
		
		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();
		 
	
}
}