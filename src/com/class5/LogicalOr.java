package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*7 days a week
		 * if day is 2 or 4 --> SDLC class
		 * if day is 6 or 7 --> Java Class
		 * if day is 1 or 5 --> No class
		 * if day =3 --> review class
		 *
		 */
		
		int day =7;
		
		if (day==2 || day ==4) {
			System.out.println("sdlc class");
			
		}else if(day==1 || day==7) {
			System.out.println("java class");
			
		}else if(day==3) {
			System.out.println("no class");
			
		}else {
			System.out.println("not a valid day");
		}
		
		/*7 days a week
		 * if day is tue or thur --> SDLC class
		 * if day is sat or sun --> Java Class
		 * if day is mond or fri --> No class
		 * if day =wed --> review class
		 *
		 */
String weekday ="fri";
		
		if (weekday.equals("tue")||weekday.equals("thur")) {
			System.out.println("sdlc class");
			
		}else if(weekday.equals("sat")||weekday.equals("sun")) {
			System.out.println("java class");
			
		}else if(weekday.equals("mon")||weekday.equals("fri")) {
			System.out.println("no class");
			
		}else {
			System.out.println("not a valid day");
		}

	}

}
