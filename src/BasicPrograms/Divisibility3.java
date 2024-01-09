package BasicPrograms;

public class Divisibility3 {
	public static void main(String args[]) {
		int d=6;
		System.out.println(d%2==0);
		System.out.println(d%3==0);
		if((d%2==0)&&(d%3==0)) {
			System.out.println("Number is divisible by both 2 and 3");
		}else {
			System.out.println("Number is not divisible by both 2 and 3");
		}
	}

}
