package ReplHomwork;

public class Repl95_StringManip {

	public static void main(String[] args) {
		/*
		 * Output 1: print str starting at index 5 and going till the end. 
		 * Output 2: print str starting at index 7 and ending at index 10. 
		 * Output 3: print "harambe". This must not be a new string, must be from str. 
		 * Output 4: print "t f". This must not be a new string, must be from str
		 */
		// Start here
		
		 String str = "laptops out for harambe";
		 System.out.println(str.substring(5));
		 System.out.println(str.substring(7, 10));
		 System.out.println(str.substring(15));
		 System.out.println(str.substring(10, 13));
		 
	}

}
