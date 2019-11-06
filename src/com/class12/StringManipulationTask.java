package com.class12;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
		// PASSW
		Scanner scan =new Scanner(System.in);
        
        while(true) {
            System.out.println("Please enter your username: ");
            String userName = scan.nextLine();
            
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();
            System.out.println("Please confirm your password: ");
            String confirmedPassword = scan.nextLine() ;
            if(password.isEmpty()||userName.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
                continue;
            }
            if(password.length()<=8) {
                System.out.println("The password must be at least 8 characters");
                continue;
                
            }
            if(password.contains(userName)) {
                System.out.println("The password cannot contain username");
                continue;
            }
            if(!password.equals(confirmedPassword)) {
                System.out.println("Passwords do not match");
                continue;
            }
            System.out.println("Your username and password has been created");
            break;
        }
        scan.close();

	}

}
