package ReplHomwork;

public class Repl73ArrayAnd74 {

	public static void main(String[] args) {
		/*
		 *  Write a program that creates an array of integers that stores the following values: 
		 *  45, 78, 12,  67, 55 and then prints all array values.
		 */
		
int [] nums=new int [5];
		
		nums[0]=45;
		nums[1]=78;
		nums[2]=12;
		nums[3]=67;
		nums[4]=55;
		
		System.out.println(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]);

		System.out.println("*************************");
		
		
//		Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
//		Print only values that stored with even index including 0.
//		
		
int [] num=new int [9];
		
		num[0]=45;
		num[1]=78;
		num[2]=12;
		num[3]=67;
		num[4]=55;
		num[5]=89;
		num[6]=23;
		num[7]=77;
		num[8]=88;
		
		
		
		
		System.out.println(num[0]+" "+num[2]+" "+num[4]+" "+num[6]+" "+num[8]);
		
	}

}
