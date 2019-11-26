package ReplHomwork;

public class Main123 {

	public static void main(String[] args) {
		/*
		 * Create a method with following specs:
		 * 
		 * Return Type: String Method Name: makeThreeSubstr 
		 * Parameters: a String called "word" an integer called "startIndex" an integer called "endIndex"
		 * 
		 * Then inside method write logic to return the result of substring from
		 * "startIndex" to "endIndex" which repeated 3 times with no space. write code
		 * that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
		 * 
		 * Examples: makeThreeSubstr("hello",0,2) ==> result "he" repeated 3 times
		 * "hehehe" makeThreeSubstr("shenanigans",3,7) ==>result "nani" repeated 3 times
		 * "naninaninani" Output: "hehehe" "naninaninani"
		 */
		String x= makeThreeSubsstr("hello",0,2);
		String y= makeThreeSubsstr("shenanigans",3,7);
		System.out.println(x);
		System.out.println(y);

	}
	  static String makeThreeSubsstr(String word,int startIndex, int endIndex) {

		String a=word.substring(startIndex, endIndex);
		String b= a+a+a;
		return b;
	}

}
