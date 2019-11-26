package com.class02;

public class DanPractice {
	public static void main(String[] args) {

		
		
		double x= 1.1;
		double y= 2.2;
		
		double plus = x+y;
		double sub2 = x-y;
		double multi2 = x*y;
		double div2 = x/y;
		
		

		String add = "sum";
		String divide = "remainder";
		String multi= "product";
		String sub= "difference";
		
		
		System.out.println("The " + add + " of 2 numbers " + x +" and " + y + " is equal to " + plus);
		
		//“The _______ of 2 numbers ___ and ___ is equalto _____”
		
		System.out.println("The " + sub + " of 2 numbers " +x+" and "+y+ " is equal to " +sub2);
	
		System.out.println("The "+ multi + " of 2  numbers "+x+" and "+y+ " is equal to "+multi2);
		
		System.out.println("The "+divide+ " of 2 numbers "+x+" and " + y+ " is equal to "+div2);
		
		
		/*
		 * Write a program to find the square of the number3.9. 
		 * You program should say “The square of the____ is ____ “
		 * 
		 *
		 */
		
		
		double w = 3.9;
		double sqr = w*w;
		
		System.out.println("The square of "+ w+" is "+sqr);
		
		
		/*
		 * Write a program to print the area and perimeter of a rectangle with base = 5 and  height = 8. 
		 * Your program should say.
		 *  “The perimeter of a rectangle with a base of ___ and a height of ____ is equal to _____and the area is equal to __”
		 * 
		 */
		
		int base=5;
		int height=8;
		
		int area=base*height;
		int perim=(base*2)+(height*2);
		
		System.out.println(perim);
		
		System.out.println("The perimeter of a rectangle with a base of "+base+" and a height of "+height+" is equal to "+perim+" and the area is equal to "+area);
		
		
	}

}
