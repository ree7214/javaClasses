package PreviousReplHomwork;

abstract class Parent{
	public abstract void method1();
	public abstract void method2();
}
public class Main171 extends Parent {

	@Override
	public void method1() {
		System.out.println("abstract method1 implementation in main class");
		
	}

	@Override
	public void method2() {
		System.out.println("abstract method2 implementation in main class");
		
	}
	public static void main(String[] args) {
		Main171 obj=new Main171();
		obj.method1();
		obj.method2();
	}
}
