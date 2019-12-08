package PreviousReplHomwork;

public class Main169 {

	public static void main(String[] args) {
		Child3 obj=new Child3();
		Child3 obj1=new Child3(10);
	}
}
class Parent3{
	Parent3(){
		System.out.println("Parent Constructor without argument");
	}
	Parent3(int number){
		System.out.println(number);
	}
}
class Child3 extends Parent3{
	Child3(){
		System.out.println("Child Constructor without argument");
	}
	Child3(int number){
		super(number);
	}
}