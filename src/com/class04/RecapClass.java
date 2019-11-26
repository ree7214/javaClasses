package com.class04;

public class RecapClass {
public static void main(String[] args) {
	/*
	 * Class schedule
	 * if tue --> sdlc 
	 * if wed -=-> java review
	 * if thur-->sdlc class
	 * if sat-->java coding
	 * if sun-->my favorite coding
	 * 
	 * 
	 */
	
	int day=4;
	if (day==2) {
		System.out.println("SDLC Class");	
	}else if (day==3) {
		System.out.println("Review Class");
	
  }else if (day==4) {
	  System.out.println("SDLC Class");
  }else if (day==6) {
	System.out.println("Java Class");  
  }else if (day==7) {
  System.out.println("My favorite Java Class");
  }else {
	  System.out.println("There is no class at school");
  }
	
}
}
