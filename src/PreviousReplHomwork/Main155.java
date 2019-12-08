package PreviousReplHomwork;

public class Main155 {

	public static void main(String[] args) {
		Main155 obj=new Main155();
		obj.m1();
		obj.m1(10);
	

	}
	private static void m1() {
		System.out.println("private m1 method");
	}
	private static void m1(int num) {
		System.out.println("private m1 method with int parameter");
	}

}
