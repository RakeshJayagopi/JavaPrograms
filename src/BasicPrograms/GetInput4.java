package BasicPrograms;

import java.util.Scanner;
public class GetInput4 {
static int GetInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the first number");
	int a=sc.nextInt();
	System.out.println("Input the second number");
	int b=sc.nextInt();
	System.out.println("Input the third number");
	int c=sc.nextInt();
	int smallest=findSmallest(a,b,c);
	System.out.println("The smallest number among "+a+","+b+" and "+c+" is:"+smallest);
	if((a<=b)&&(a<=c)) {
		return a;
	}else if((b<=a)&&(b<=c)) {
		return b;
	}else
		return c;
	}	
public static void main(String args[]) {
	System.out.println("GetInput");
}
}