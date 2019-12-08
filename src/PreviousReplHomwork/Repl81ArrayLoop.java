package PreviousReplHomwork;

public class Repl81ArrayLoop {

	public static void main(String[] args) {
		/*Write a program that creates an array of integers that stores 
		 * the following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
		 * Print the values using a for loop starting at index 1 and increment by 3, 
		 * and then print value divided by its index.
		 * Output:
		 * 78 13 11
		 */
		
		int [] num= {45,78,12,67,55,89,23,77,88};
		
		 for(int i=1; i<num.length; i+=3) {
			 
			 System.out.print(num[i]/i+" ");
			 
	    }
		 
		 System.out.println();

	}

}
