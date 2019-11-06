package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		String [] car= {"ford", "mazda", "kia", "bmw","toyota", "audi"};
		for(String typeCar:car) {
			System.out.println(typeCar);
			
		}
		System.out.println("***********************************************************");
	
		int [] num1 = {2,3,4,5,6};
		int sum=0;
		for(int num2:num1) {
			sum+=num2;
		}
		System.out.println(sum);
		
		System.out.println("***********************************************************");
		String [] country= {"USA", "Russia", "China"};
		
		 for(int i=0; i<country.length; i++) {
			 if (country[i].equals("USA")) {
				 System.out.println("Washington DC");
			 }else if (country[i].equals("Russia")) {
				 System.out.println("Moscow");
				 
			 }else if (country[i].equals("China")) {
				 System.out.println("Beijing");
			 }else {
				 System.out.println("unknown");
			 }

	}
	
	}
}
