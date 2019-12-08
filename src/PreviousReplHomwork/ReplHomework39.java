package PreviousReplHomwork;

import java.util.Scanner;

public class ReplHomework39 {

	public static void main(String[] args) {
		// For you to do:
		//Prompt user with a question: "Is it weekend?"
		//	If it is not a weekend --> subject="Manual testing"
		//	Otherwise --> subject="Java"

		//	Output: 
		//	"Today you will be learning ____"
		System.out.println("Is it weekend?");
		Scanner scan=new Scanner (System.in);
		Boolean question=scan.nextBoolean();
		
		String subject=null;
		
		if(!question) {
			subject="Manual testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);

	}

}
