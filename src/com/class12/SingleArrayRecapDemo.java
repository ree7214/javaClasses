package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		int [] array1=new int [4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=15;
		
	//	System.out.println(array1[1]);
		
		for (int i = 0; i < array1.length; i++) {
			
			System.out.println(array1[i]);
			
		}
		
		System.out.println("*********************");
		for (int i: array1) {
			System.out.println(i);
		}
		

	}

}
