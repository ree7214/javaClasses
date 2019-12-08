package PreviousReplHomwork;

public class Main170 {

	public static void main(String[] args) {
		Child4 obj=new Child4("Fairfax");
		obj.display();
	}
}
class Parent4{
	Parent4(){
		
	}
	String city;
	
	 Parent4(String city){
		this.city=city;
	}
	public void display() {
		System.out.println("City name "+city);
	}
}
class Child4 extends Parent4{
	
	Child4(String city){
		super.city=city;
	}
}