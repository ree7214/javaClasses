package com.class21;

public class School {

	public static void main(String[] args) {
		Student.school="Morning School";
		
		Student student0 = new Student();
		student0.displayInfo();
		
		
		Student student1=new Student();
		//assigning instance variables
		student1.studentName="Eric";
		student1.gpa=3.95;
		Student.school="Syntax";//<----using class name because school is static
		
		
		student1.displayInfo();
	//	student1.study(3);
		
		Student student2=new Student();
		student2.studentName="Maria";
		student2.gpa=4.00;
		Student.school="Syntax Technologies";//<----using class name because school is static
				
		student2.displayInfo();
//		student2.study(5);
		System.out.println("after changing school to static");
		student1.displayInfo();
		
		System.out.println("student0 display info");
		student0.displayInfo();
	

	}

}
