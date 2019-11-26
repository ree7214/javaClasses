package com.class25;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("-----Creating an object of the employee class----");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.getPaid();
		
		System.out.println("----Creating an object of the ScrumTeam----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeeting();
		
		System.out.println("----Creating an object of the Developer----");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeeting();
		dev.employeeID=101;
		//dev.employeeSsn not accesiable because private access modifier
		
		System.out.println("----Creating an object of the Tester----");
		Tester test=new Tester();
		test.salary=70000;
		test.work();
		test.getPaid();
		test.Test();
		test.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		test.attendScrumMeeting();
		
		
				
	}

}
