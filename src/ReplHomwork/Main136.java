package ReplHomwork;

public class Main136 {
	// Repl 136
	
//	String name="Programming is amazing.";
//
//	
//	void   m1() {
//		System.out.println(name);
//	}
//	static void m2() {
//		System.out.println("Java is awesome.");
//	}
//	public static void main(String[] args) {
//		Main136 obj=new Main136();
//		obj.m1();
//		obj.m2();
//	}
	
	/*
	 * Reple 137
	 */
	
//	static int a=100;
//	
//	public static void main(String[] args) {
//		
//		Main136 obj=new Main136();
//		System.out.println(a);
//		obj.a=200;
//		System.out.println(a);
//		obj.a=300;
//		System.out.println(a);
//	}
	/*
	 *Repl 138 	
	 */
	
	static int count=0;
	
	static void  display() {
		for (int i=0; i<=3; i++)
		count=i;	
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Main136 obj1=new Main136();
	    obj1.display();
		
		Main136 obj2=new Main136();
		obj2.display();
		
		Main136 obj3=new Main136();
		obj3.display();
	}
}
