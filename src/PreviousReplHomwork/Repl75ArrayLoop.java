package PreviousReplHomwork;

public class Repl75ArrayLoop {

	public static void main(String[] args) {
		/*Write a program that creates an array with the following
		 *  values{s, a, y,  b, n, c, t,  d, a, e, x} and prints the 
		 *  values starting at index 0 and multiple of 2 using a for loop.
		 *  
		 *  Output:
		 *  syntax
		 */
		char [] letter= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		
		 for(int i=0; i<letter.length; i+=2) {
			 
			 System.out.print(letter[i]);
			 
	    }
		 
		 System.out.println();
	    
		}

}
