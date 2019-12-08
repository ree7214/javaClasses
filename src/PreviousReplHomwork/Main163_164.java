package PreviousReplHomwork;

import java.util.Scanner;

public class Main163_164 {
	//repl 163
//	final String FinalVariable="hello world!";
//
//	public static void main(String[] args) {
//		Main obj = new Main();
//		System.out.println(obj.FinalVariable);
//	}
	
	// repl 164
	

	final public void reverseMethod(String name){
		Scanner scan=new Scanner (System.in);
		 name=scan.nextLine();

		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1; i>=0; i-- ) {
			System.out.print(charArray[i]);
		}
	
	}
	public static void main(String[] args) {
		
	Main163_164 obj = new Main163_164();
		obj.reverseMethod("hello");
		
	}
	
}
