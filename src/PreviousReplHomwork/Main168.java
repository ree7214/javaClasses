package PreviousReplHomwork;

public class Main168 {

	public static void main(String[] args) {
		 Child2 obj=new Child2();
		 obj.m2();
	}
}
class Parent2{
	
	void m1(){
		System.out.println("m1 method in parent class");
	}
}
class Child2 extends Parent2{
	
	void m1() {
		System.out.println("m1 method in child class");
	}
	void m2() {
		this.m1();
		super.m1();
	}
}