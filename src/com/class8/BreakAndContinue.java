package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword breaks/exit the loop
		
		for (int i=0; i<10; i++) {
			
			if(i==2) {
				break;
			}System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		System.out.println("*************************");
		//continue --> it will skip Current iteration
		
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				continue;
				
			}
			System.out.println(a);
		}

	}

}
