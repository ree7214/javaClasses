package com.ReplHomewok;

public class Main178 implements Functions{

	public void display(double num) {
		
	}

	public double adding(double Firstnumber, double SecondNumber) {
		double sum=Firstnumber+SecondNumber;
		return sum;
	}

	public double subtracting(double Firstnumber, double SecondNumber) {
		double sum=Firstnumber-SecondNumber;
		return sum;
	}

	public double multiply(double Firstnumber, double SecondNumber) {
		double sum=Firstnumber*SecondNumber;
		return sum;
	}

	public double dividing(double Firstnumber, double SecondNumber) {
		double sum=Firstnumber/SecondNumber;
		return sum;
	}
	
	public static void main(String[] args) {
		Main178 obj=new Main178();
		System.out.println("Result is ::: "+obj.adding(100, 20));
		System.out.println("Result is ::: "+obj.subtracting(100, 20));
		System.out.println("Result is ::: "+obj.multiply(100, 20));
		System.out.println("Result is ::: "+obj.dividing(100, 20));
	}

}