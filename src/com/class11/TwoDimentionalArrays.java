package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		//Declare 2D Array
		
		int [][] array =new int [3][4];
		
		// 1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		// 2nd row
		
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		// 3rd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=6;
		System.out.println(array[1][3]);
		
		
		//Task: create an 2D Array of String with 2 rows and 3 columns.
		
		String [] [] name = new String [2][3];
		
		name[0][0]="Maria";
		name[0][1]="Mike";
		name[0][2]="Oliver";
		
		name[1][0]="Cam";
		name[1][1]="Ava";
		name[1][2]="Craig";
		
		System.out.println(name [0][0]);
		
		System.out.println("*******************");
		
		int [][]numbers= {
				{8, 7, 5, 3 ,8},
				{1, 5, 6, 4, 9},
				{8, 0, 5, 7,1}
				
		};
		
		
		System.out.println("The value in index 1 and 4 is "+numbers[1][4]);
		
		System.out.println("*********************");
		
		// To identify  the numbers of rows/arrays
		System.out.println("the numbers of the Rows are:"+numbers.length);
		
		// To identify the number of columns/elements in that row
		System.out.println("The numbers of columns are:"+numbers[0].length);
		
		System.out.println("---------------------------");
		
		
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers [i][j]+" ");
				}
			System.out.println();
			}
		
		
		}
		
	}

