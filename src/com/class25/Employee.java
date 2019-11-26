package com.class25;

public class Employee {
	
	int salary;
	public static String companyName;
	protected int employeeID;
	private String employeeSsn;
	
	
	void work() {
		System.out.println("I work at "+companyName);
	}
	void getPaid() {
		System.out.println("I get paid "+salary+" salary");
	}

}
