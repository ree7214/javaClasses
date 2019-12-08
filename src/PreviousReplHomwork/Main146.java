package PreviousReplHomwork;

//Repl 146 and 149
public class Main146 {

	public static void main(String[] args) {
		A obj = new A(10);
		B obj1 = new B();
		C obj2 = new C();
		obj1.B();
		obj2.C();

	}
}

class A {
	A() {

	}

	int number = 10;

	A(int number) {
		this.number = number;
		// System.out.println("I");
		System.out.println(10);

	}
}

class B extends A {
	public void B() {

		// System.out.println("am");
		System.out.println(20);
	}
}

class C extends B {
	public void C() {
//		System.out.println("tester");
		System.out.println(30);
	}
}
