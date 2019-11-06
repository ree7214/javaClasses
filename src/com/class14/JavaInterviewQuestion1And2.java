package com.class14;

public class JavaInterviewQuestion1And2 {

	public static void main(String[] args) {
		/*
		 * 1.Write a program to swap 2 numbers without a temporary variable?Swap 2 stringswithout a temporary variable?
		 */
		
		int a=1;
		int b=2;
		
		a+=b;
		System.out.println(a);
		b-=a;
		System.out.println(b);
		
		System.out.println("********************");
		
		String a1 = "Love";
        String b1 = "You";
        System.out.println("Before swap: " + a1 + " " + b1);
        /*
         * a1 now becomes LoveYou
         *now  we need to remove substring of "love" to keep remaining string "you"
         *so now a1 is equal to "You"
         *now add substring of "love" 
         *
         */
        
        System.out.println("               ");
        
        a1 = a1 + b1;
        b1 = a1.substring(0, a1.length() - b1.length());
        a1 = a1.substring(b1.length());
        System.out.println("After : " + a1 + " " + b1);
		
        /*
		 * Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		 */
		System.out.println("********question 2********");
        
        // question 2
        
		  int num[] ={ 900,90,6,7,500,4,600,20,3};
	        int largest = num[0];
	        int secondLargest = num[1];
	        
	        
	        for (int i=1; i<num.length; i++){
	        
	            if(largest < num[i]){
	                secondLargest = largest;
	                largest = num[i];
	            
	        } else if(secondLargest < num[i]){
	                secondLargest = num[i];
	            }
	        }
	        
	        System.out.println("Largest : " +largest);
	        System.out.println("Second Largest : "+secondLargest);
	        
	        

	}

}
