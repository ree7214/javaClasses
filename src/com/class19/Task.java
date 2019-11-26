package com.class19;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		

	
	Scanner scan=new Scanner (System.in);
	String name=scan.nextLine();
	String lastName=scan.nextLine();
	String emailType=scan.nextLine();
	
	Task email=new Task();
	
	String emailAddress=email.createEmail(name, lastName, emailType);
	System.out.println(emailAddress);
	
}
	String createEmail(String name, String lastName, String emailType) {
	String email=(name+lastName+"@"+emailType+".com");	
	
	return email;

	}
	
	
}
