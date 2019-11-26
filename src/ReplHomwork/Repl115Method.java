package ReplHomwork;

public final class Repl115Method {
	/*
	 * Step1: Create three method with two Parameters as int Step2: Write the logic
	 * in methods to perform actions below: the first method for multiplication The
	 * second method for addition The third method for subtraction Step3: call all
	 * methods
	 * 
	 * 1. for the addition method add two numbers to make 30 but put those numbers
	 * in the parameters 2. for multiplication multiply two numbers to make 30 but
	 * put those two numbers in your parameters 3. for Subtraction subtract two
	 * numbers to equal 20, with using parameters.
	 * 
	 */

	int sum(int num1,int num2) {
	int	add=num1+num2;
	System.out.println("Addition "+add);
	return add;
	}
	int multiply(int num1, int num2) {
	int multi=num1*num2;
	System.out.println("Multiplication "+multi);
	return multi;
	}
	int subtract(int num1, int num2) {
		int sub=num1-num2;
		System.out.println("Subtraction "+sub);
		return sub;
	}
	public static void main(String[] args) {
		
		Repl115Method action=new Repl115Method();
		
		action.sum(15, 15);
		action.multiply(15, 2);
		action.subtract(30, 10);
		
	}

}
