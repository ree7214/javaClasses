package PreviousReplHomwork;

public class Main167 {

	public static void main(String[] args) {
		Child1 obj = new Child1("Vienna");
	}
}

class Parent1{
	
	void Parent1(String city){
		System.out.println(city);
	}
	void Parent1() {
		System.out.println("Parent Constuctor");
	}
}

class Child1 extends Parent1{
	
	Child1(String city){
		super.Parent1(city);
	}

}
