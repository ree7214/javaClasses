package PreviousReplHomwork;

class Repl122Boolean {
	
	public static void main(String[] args) {
		Repl122Boolean even=new Repl122Boolean ();
		boolean result=even.bothEven(4, 2);
		System.out.println(result);
		
	}

	boolean bothEven(int num1, int num2) {
	
		if (num1%2 == 0 && num2%2==0) {
			return true;
		}else {
			return false;
		}
	}
}