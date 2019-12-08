package com.class31;
//Task 2
public abstract class Marks {
	
	double math;
	double pe; 
	double history;
	double science;

	public abstract void getPercentage();
}
class A extends Marks{
	
	A(double math, double pe, double history){
		this.math=math;
		this.pe=pe;
		this.history=history;
	}

	@Override
	public void getPercentage() {
		System.out.println((math+pe+history)/3);
		
	}
	
}
class B extends Marks{
	
	B(double math, double pe, double history, double science){
		this.math=math;
		this.pe=pe;
		this.history=history;
		this.science=science;
	}
	
	@Override
	public void getPercentage() {
		
		System.out.println((math+pe+history+science)/4);
		
	}
	
}