package BasicPrograms;

import java.util.Scanner;
public class GetInput3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("Addition of 2 values=a+b="+a+"+"+b+"="+sum);
		
	}

}
