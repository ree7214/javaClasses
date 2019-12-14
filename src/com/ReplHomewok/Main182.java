package com.ReplHomewok;

public class Main182 extends EncapsulationDemo{

	public static void main(String[] args) {
		EncapsulationDemo encap=new EncapsulationDemo();
	//	encap.setempName("John");
	//	encap.setempAge(30);
		
	//	System.out.println("Employee Name: "+encap.getEmpName());
		
		System.out.println("Employee Name: "+encap.getEmpName("John"));
		System.out.println("Employee Age: "+encap.getEmpAge(30));
		
		
	}

}
