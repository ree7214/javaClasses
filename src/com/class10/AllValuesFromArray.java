package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		              //  0    1    2   3   4   5
		char [] grades= {'A', 'B', 'C','D','E','F'};
		
		int a=2;
	//	System.out.println(grades[a]);//2=c
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
		}
		
		String [] animals= {"cat", "dog", "cow","snake","elephant"};
		int size=animals.length;
		
		for(int i=0; i<size;i++) {
			System.out.println(animals [i]+"");
					}
		System.out.println("***********************************************************");
		
		double [] num= {5.0, 5.2, 5.3, 5.4, 5.5};
		double size1=num.length;
		
		for(int b=0; b<size1; b++) {
		System.out.print(num [b]+" ");
		
	
		
		
	}
		System.out.println();
		System.out.println("*************************************");
		
		
		String [] animals1= {"cat", "dog", "cow","snake","elephant"};
		
		
		for(int i=0; i<animals1.length;i++) {
			if (animals[i].contentEquals("dog")) {
				System.out.println("I love dogs");
			}else {
			System.out.println(animals1 [i]);
			}		
			}
		
		//Create an array of countries. While retrieving all values from an array print capital for each country.
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
	
		 // anther way
		 System.out.println("***********************************************************");
		 String[] countries= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};
		 
		 		for(int i=0; i< countries.length; i++) {
		 			
		 			switch (countries[i]) {
		 			case "Afghanistan":
		 			System.out.println("Kabul");
		 			break;
		 			
		 			case "Colombia":
		 				System.out.println("Bogata");
		 				break;
		 				
		 			case "USA":
		 				System.out.println("Washington DC");
		 				break;
		 				
		 			case "Russia":
		 				System.out.println("Moscow");
		 				break;
		 				
		 			case "Turkey":
		 				System.out.println("Ankara");
		 				break;
		 			
		 			
		 			}
		 			
		 			
		 		}
		 
	}				
}
