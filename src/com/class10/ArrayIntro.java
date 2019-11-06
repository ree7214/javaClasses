package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int []b; // declare an array----> preferred way
		
		 //int c[]; // another way
		
		b=new int [4];// initialize
		
		//2nd way ----> all in one line (declaration & initialation)
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access value from an array
		
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		
		String [] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		
		// Today we have Java class
		
		System.out.println("Today we have "+classes [0]+" class.");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		//how can i change 1 to 100
		
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);//100+3
		
		
		String []names=new String[4];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jamie";
		names[3]="Olga";
		
		System.out.println(names[3]);
		
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		// we are putting less elements inside
		// compliler with give default values
		System.out.println(numbers[2]);

	}

}
