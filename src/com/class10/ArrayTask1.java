package com.class10;

public class ArrayTask1 {

	public static void main(String[] args) {
		
		char [] array= {'A', 'B', 'C','D','E','F'};
		System.out.println(array[1]);
		
		char []grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		String []names=new String[4];
		names[0]="Maria";
		names[1]="Nes";
		names[2]="Gulnar";
		names[3]="Julia";
		
		System.out.println(names[0]);
		
		String [] groupNames= {"Maria", "Nes", "Gulnar","Julia"};
		System.out.println(groupNames[0]);
		
		String [] classes=new String[5];
		classes[0]="Java";
		classes[1]="Saturday";
		classes[2]="Day.";
		classes[3]="coding";
		classes[4]="is";
		
		System.out.println(classes[1]+" "+classes[4]+" "+classes[0]+" "+classes[3]+" "+classes[2]);
		
		

	}

}
