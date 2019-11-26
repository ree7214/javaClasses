package com.class21;

public class TaskStudent {
public	String studentName;
public	int studentID;
public static int numberOfStudents;
	
	
void displayStud(){
	System.out.println("The total number of student are: "+numberOfStudents);
}
	
public static void main (String []args) {
	TaskStudent stud1=new TaskStudent();
	stud1.studentName="Maria";
	stud1.studentID=10;
	TaskStudent.numberOfStudents++;
	
	TaskStudent stud2=new TaskStudent();
	stud2.studentName="Mike";
	stud2.studentID=11;
	TaskStudent.numberOfStudents++;
	
	TaskStudent stud3=new TaskStudent();
	stud3.studentName="Daniel";
	stud3.studentID=12;
	TaskStudent.numberOfStudents++;
	
	stud1.displayStud();
	stud2.displayStud();
	stud3.displayStud();
	
	
	System.out.println("The total number of students are: "+TaskStudent.numberOfStudents);
}

}