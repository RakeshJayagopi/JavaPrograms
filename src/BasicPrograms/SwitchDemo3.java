package BasicPrograms;

import java.util.Scanner;
public class SwitchDemo3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int e=sc.nextInt();
		System.out.println("Enter number 2");
		int d=sc.nextInt();
		System.out.println("Enter your operation");
		String f=sc.next();
		char g=f.charAt(0);
		switch(g) {
		case'+':
			System.out.println("Addition operator="+(e+d));
			break;
		case'-':
			System.out.println("Subtraction operator"+(e-d));
			break;
		case'*':
			System.out.println("Multiplication operator"+(e*d));
			break;
		case'/':
			System.out.println("Division operator"+(e/d));
			break;
		default:
			System.out.println("invalid operator value");
			
		}
		
	}

}
