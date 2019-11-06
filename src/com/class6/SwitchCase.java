package com.class6;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * 7 weekdays
		 * if day==1 --> Monday
		 * if day==2 --> Tuesday
		 * if day==3 --> Wednesday
		 * if day==4 --> Thursday
		 * if day==5 --> Friday
		 * if day==6 --> Saturday
		 * if day==7 --> Sunday
		 */
		
		int day=1;
		String weekDay;
		
		if(day==1) {
			weekDay="Monday";
			
		}else if(day==2) {
			weekDay="Tuesday";
			
		}else if(day==3) {
			weekDay="Wednesday";
			
		}else if(day==4) {
			weekDay="Thursday";
			
		}else if(day==5) {
			weekDay="Friday";
			
		} else if (day==6) {
			weekDay="Saturday";
			
		}else if(day==7) {
			weekDay="Sunday";
		}else {
			weekDay="Invalid";
		}System.out.println(weekDay);

		System.out.println("********************");
		
		day=3;
		
		switch (day) {
		case 1:
			weekDay="Monday";
			break;
			
		case 2:
			weekDay="Tuesday";
			break;
			
		case 3:
			weekDay="Wednesday";
			break;
			
		case 4:
			weekDay="Thursday";
			break;
			
		case 5:
			weekDay="Friday";
			break;
			
		case 6:
			weekDay="Saturday";
			break;
			
		case 7:
			weekDay="Sunday";
			break;
			
			default:
				weekDay="Invalid";
				
			
			
		}
		System.out.println(weekDay);
		
	}

}
