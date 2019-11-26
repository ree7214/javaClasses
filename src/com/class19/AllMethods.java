package com.class19;

public class AllMethods {
// create methods to return value of sum
	//sub
	//mult
	//div
	
	int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	int sub(int num1, int num2) {
		int sub = num1+-num2;
		return sub;
	}
	int div(int num1, int num2) {
		int div = num1/num2;
		return div;
}
	int mult(int num1, int num2) {
		int mult = num1*num2;
		return mult;
}
	int findLargest(int num1, int num2) {

		int largest;
		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}
	// method to return whether number is odd
	boolean isOdd(int num) {
		boolean isOdd;
		
		if (num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}
	/** method will take a weekday number and return 
	 * a weekday name
	 */
	String WeekDayName(int weekDay) {
		String WeekDayName;
		switch(weekDay) {
		case 1:
			WeekDayName="Monday";
			break;
		case 2:
			WeekDayName="Tuesday";
			break;
		case 3:
			WeekDayName="Wed";
			break;
		case 14:
			WeekDayName="Thursday";
			break;
		case 5:
			WeekDayName="Friday";
			break;
		case 6:
			WeekDayName="Saturday";
			break;
		case 7:
			WeekDayName="Sunday";
			break;
			default:
				WeekDayName="Unkown";
		}
		return WeekDayName;
		
	}
	
}
