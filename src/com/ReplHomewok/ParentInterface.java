package com.ReplHomewok;

public interface ParentInterface {
	void parentMethod();
}

interface ChildInterface {
}

interface Childinterface extends ParentInterface {
	 void childMethod();
}

class Main implements ChildInterface {
	void childMethod() {
		System.out.println("Child Method----hi syntax solutions how are you");
	}

	void parentMethod() {
		System.out.println("Parent Method----welcome to syntax solutions");
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.parentMethod();
		obj.childMethod();
	}
}
