package ReplHomwork;

public class Main121 {

	public static void main(String[] args) {
		/*
		 * Return Type: char Method 
		 * Name: getChar 
		 * Parameters: String called "word"
		 * Integer called "index"
		 * 
		 * Then write your logic on getChar method to Find the character in given String
		 * at given index number
		 * 
		 * Examples: getChar("hello",1) ==> 'e'
		 */
		Main121 word=new Main121 ();
		
		char charWord=word.getChar("hello", 1);
		
		System.out.println(charWord);

	}
	String w="";
	
	char getChar(String word, int index) {
		
	char w=word.charAt(1);
	
		return w;
		
		}
	
}
