package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String>arrayList=new ArrayList<>();
		// to store values inside your collection
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		// to retrieve the value from arrayList
		System.out.println(arrayList.get(1));
		
		// more values
		arrayList.add("James");
		arrayList.add("Maria");
		arrayList.add("Mike");
		
		//how many elements inside the arrayList?
		int size =arrayList.size();
		System.out.println(size);
		
		//creating an Object of ArrayList that will hold numeric values
		ArrayList<Integer>NumArrayList=new ArrayList<>();
		NumArrayList.add(100);
		NumArrayList.add(200);
		NumArrayList.add(300);
	
		
		// update the value
		NumArrayList.set(0, 1000);
		
		System.out.println("*****************");
		
		//retrieving values
		System.out.println(NumArrayList.get(2));
		// int num=control or counter----> controls the number of the iterations for the loop
		System.out.println("*****one way using regular for loop***");
		for (int num=0; num<NumArrayList.size(); num++) {
			System.out.println(NumArrayList.get(num));
		}
		System.out.println("*****another way using enhanced for loop****");
		for(Integer number:NumArrayList) {
			System.out.println(number);
		}

	}

}
