package PreviousReplHomwork;

public class Main166 {
	public static void main (String [] args ) {
		Childz obj=new Childz();
	}
}
class Parentz{
	
	void Parentz(){
		System.out.println("This is Parent constructor");
	}
}

class Childz extends Parentz{
	
	Childz(){
		super.Parentz();
	}

}

