package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums=new int [4];
		
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find number of elements we use .length (property of an array)
		System.out.println(nums.length);
		
		//shorter way to create an array
		                    //0        1        2        3
		String [] array= {"Wingter", "Fall", "Summer","Spring"};
		
		//  I was born in Summer
		System.out.println("I was born in the "+array[2]);
		
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
			

	}

}
