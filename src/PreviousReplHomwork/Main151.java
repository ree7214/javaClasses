package PreviousReplHomwork;

public class Main151 {

	public static void main(String[] args) {
		Y obj = new Y();
		obj.display();
	}

}

class X {

	public static void display() {

		System.out.println("Class X");

	}

}

class Y extends X {

	public static void display() {
		System.out.println("Class Y");
	}

}