package com.class6;

import java.util.Scanner;

public class ReplPractice {

	public static void main(String[] args) {
		// "Are you thirsty?"
		//"Are you sleepy?"

		//If user is thirsty and not sleepy--> drink=Water
	    //If user is thirsty and sleepy--> drink=Coffee
		//If user is not thirsty and sleepy --> drink=Tea
		//Otherwise drink="Nothing"

		//Output:
		//"Looks like you need ___ "TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.println("Are you thirsty?");
		Boolean thirsty=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		Boolean sleepy=scan.nextBoolean();
		String drink=null;
		
		if(thirsty && !sleepy) {
			
			drink="Water";
			
			
		}else if (thirsty && sleepy) {
			drink="Coffee";
			
		}else if (!thirsty && sleepy) {
			drink="Tea";
		}else {
			drink="Nothing";
		}
		System.out.println("Looks like you need "+drink);
		
	}	
	
}
