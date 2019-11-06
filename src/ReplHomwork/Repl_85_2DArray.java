package ReplHomwork;

public class Repl_85_2DArray {

	public static void main(String[] args) {
		/*
		 *  Write a program that checks if a 2-D integer array is a square array,
		 *   meaning, if its rows and columns are equal
		 */
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		boolean num=true;
		
		for(int i=0; i<a.length; i++) {
		
			for(int j=0; j<a[i].length; j++) {
				
				if(a.length!=a[j].length) {
					num=false;
			}
				
		}
		
	}
		System.out.println(num);
	}
}
