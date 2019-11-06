package com.class11;

public class TwoArrayDemo2 {

	public static void main(String[] args) {
		
		
		String [][]names= {
				{"Maria", "Mike", "Dan", "Matt"},
				{"Amanda", "Anna", "Ava", "Craig"},
				{"Pat", "Oliver", "Cam","Colt" }
		
	};
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[0].length;
		System.out.println(lengthOfCols);
		
		for(String getArrays[]:names) {
			
			for(String getName:getArrays){
				
				System.out.print(getName+" ");
				
			}
			System.out.println();
		}
		
		//task 3 Create 2D Array of int type with 3row and 4col
		//and print all values of the whole array
		
		
		int [] [] numbers= {
				{2, 4, 6, 8},
				{3, 6, 9, 12},
				{4, 8, 12, 16}
		};
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			for (int j=1; j<numbers[i].length; j++) {
				
			System.out.print(numbers[i][j]+" ");
				
				sum=sum+numbers[i][j];
			}
			
			System.out.println();
		}	
		System.out.println("The sum of all elements in the array is = "+sum);
		
		// another way
		
		   int sum1=0;
	        for(int nums[]: numbers) {
	            for(int getNum:nums) {
	                sum1=sum1+getNum;
	            }
	        }
	        System.out.println("The sum of all elements in the array is="+sum1);
	    }
}

	


