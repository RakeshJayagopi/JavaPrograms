package BasicPrograms;

import java.util.Scanner;
public class GetInput2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int b=sc.nextInt();
		System.out.println("Enter your blood group");
		String name1=sc.next();
		System.out.println("Enter your phone number");
		long mobile=sc.nextLong();
		System.out.println("The entered name is="+name);
		System.out.println("The entered age is="+b);
		System.out.println("The entered blood group is"=+name1);
		System.out.println("The entered phone number is"=+mobile);
	}

}
