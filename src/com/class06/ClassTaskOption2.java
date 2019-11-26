package com.class06;

import java.util.Scanner;

public class ClassTaskOption2 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	
	String month;
	String season=null;
	
	
	System.out.println("Please enter your birth month");
	month=scan.next();
	
	if(month.equals("January")||month.equals("February")||month.equals("March")) {
		season="Winter";
		
	}else if(month.equals("April")||month.equals("May")||month.equals("June")) {
		season="Spring";
		
	}else if(month.equals("July")||month.equals("August")||month.equals("Sept")) {
		season="Summer";
		
	}else if(month.equals("October")||month.equals("November")||month.equals("December")) {
		season="Fall";
	}else {
		System.out.println("Unkown");
	}System.out.println("You were born in "+season);
}
}
