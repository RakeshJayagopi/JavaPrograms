package BasicPrograms;

public class Divisibility2 {
	public static void main(String args[]) {
		int c=18;
		System.out.println(c%3==0);
		System.out.println(c%5==0);
		if((c%3==0)||(c%5==0)) {
			System.out.println("Number is divisible by either 3 or 5");
		}else {
			System.out.println("Number is not divisible by either 3 or 5");
		}
	}

}
