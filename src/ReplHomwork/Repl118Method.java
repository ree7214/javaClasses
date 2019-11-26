package ReplHomwork;

public class Repl118Method {
	/*
	 * Complete method with the following specs:
	 * 
	 * Returns: String Method Name: makeCapital Parameters: String Write logic
	 * within the method to convert the string into all CAPS. Call method
	 * 
	 * Output: TEST
	 * 
	 */
	
	String word1="test";
	void  makeCapital() {
		System.out.println(word1.toUpperCase());
	
}

	public static void main(String[] args) {
		Repl118Method word1 = new Repl118Method();
	word1.makeCapital();

}
}