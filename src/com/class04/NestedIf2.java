package com.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("-------------");
boolean quiz=true;
int score=80;
if(quiz) {
	System.out.println("good job!!");
	if(score>90) {
		System.out.println("you got an A");
	}else if(score>80) {
		System.out.println("you got a B");
	}else {
		System.out.println("you should study more");
	}
	
}else {
	System.out.println("not good!!");
}
	}

}
