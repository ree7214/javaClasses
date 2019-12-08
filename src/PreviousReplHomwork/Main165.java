package PreviousReplHomwork;

import java.util.Scanner;

public class Main165 {
	
	void finalMethod(){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a;
		int d=b;
		System.out.println("a is now assigned value of "+d);
		System.out.println("b is now assigned value of "+c);
	} 
	public static void main(String[] args) {
		Main165 obj = new Main165();
		obj.finalMethod();
	}

}
