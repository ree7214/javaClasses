package ReplHomwork;

public class Repl_114Method {
	/*
	 * For you to do Step1: Create method with 2 Parameters as int Step2: Write the
	 * logic in that method in println statement to print hours : with minutes
	 * Step3: Call the method
	 * 
	 * Output: MUST BE!!! 11:30
	 * 
	 */
	
	void time(int hour, int min) {
		System.out.println(hour+":"+min);
	}
	
	public static void main(String[] args) {
		
		Repl_114Method time1= new Repl_114Method();
		time1.time(11, 30);
	}

}
