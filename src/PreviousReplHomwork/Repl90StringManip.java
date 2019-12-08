package PreviousReplHomwork;

class Repl90StringManip {

	public static void main(String[] args) {
		/*
		 * Create a String named "name" and assign the value "Timmy" to it. Find out how
		 * many characters are there in the given String.
		 * 
		 */

		String name = new String("Timmy");

		int nameLen = name.length();
		System.out.println(nameLen);
		
		System.out.println("**********************");
		
		String s1 = new String("hello");
		System.out.println(s1.isEmpty());
		String s2="";
		System.out.println(s2.isEmpty());
		
		System.out.println("**********************");
		
		String str1=new String("SYNTAXSOLUTIONS");
		System.out.println(str1.toLowerCase());
		String str2=new String("syntaxsolutions");
		System.out.println(str2.toUpperCase());
		

	}

}
