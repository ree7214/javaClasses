package com.class06;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		/*ask user where are they from
		 *  based on the country we will specify favorite food
		 */
		
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your country");
		
		country=scan.nextLine();
		
		switch(country){
		
		case "Turkey":
			foodName="kebab";
			break;
			
		case "Ethopia":
			foodName="Tibs";
			break;
			
		case "Morocco":
			foodName="Tajin";
			break;
		case "Kazakhstan":
		foodName="kumis";
		
		case "Pakistan":
			foodName="beryani";
			break;
			
		case "Russia":
			foodName="Caviar";
			break;
			
		case "Cuba":
			foodName="Sofrito";
			break;
			
		default:
			foodName="unknown";
			
		
		}
		System.out.println("You are from "+country+" and your favorite food is "+foodName);

	}

}
