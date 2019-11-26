package com.class21;

public class Student {
	public String studentName;
	public double gpa;
	public static String school;
	
	
	public void displayInfo() {
		System.out.println(studentName+" is attending "+ school+" and has a gpa of "+gpa);
	}
	protected void study(int hours) {
		System.out.println(studentName+" is studing for "+hours+" hours.");
	}
	

}
