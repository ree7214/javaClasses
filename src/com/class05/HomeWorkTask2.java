package com.class05;

public class HomeWorkTask2 {
	public static void main(String[] args) {
		/*
		 * declare the time (1-24) based on the time if 1-11 - morning
		 *  if 12-15- noon 
		 *  if 16-20 - evening if >20 night
		 *  
		 *  
		 */

		int time = 11;
		String timeOfDay = null;

		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";

		} else if (time >= 12 && time <= 15) {
			timeOfDay = "noon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "evening";

		} else if (time >= 20 && time <= 24) {
			timeOfDay = "night";
		} else {
			timeOfDay = "invalid";

		}
		System.out.println("time of the day is " + timeOfDay);

	}
}
