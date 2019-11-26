package com.class21;

public class Employee {
	//creating variables
	int eID;
	int salery;
	static String CEO;
	
	//creatingg method
	void printInfo() {
		System.out.println("Employee ID: "+eID+", salery is: "+salery+", CEO is "+CEO);
	}
	
public static void main(String[] args) {
	//creating objects
	Employee emp1=new Employee();
	emp1.eID=5;
	emp1.salery=80000;
	Employee.CEO="Sumair";
	emp1.printInfo();
	
	Employee emp2=new Employee();
	emp2.eID=8;
	emp2.salery=85000;
	Employee.CEO="Sumair";
	emp2.printInfo();
	
}

}
