package com.class07;

public class LoopTask1 {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 as long as it is workDay print "I need a day off and increase
		 * day once day is 6 print "I do not need a day of anymore"
		 */

		Boolean workDay = true;
		int day = 1;

		while (workDay) {

			if (day==6 || day==7) {
				System.out.println("I do not need  a day off anymore");
				workDay = false;
			} else {
				System.out.println("I need a day off");
			}

			day++;
		}

	}

}
