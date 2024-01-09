package BasicPrograms;

import java.util.Scanner;
public class GetInput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		System.out.println("Enter your mobile number");
		long mobile=sc.nextLong();
		System.out.println("The entered value is="+a);
		System.out.println("The entered mobile number is="+mobile);
	}
	

}
