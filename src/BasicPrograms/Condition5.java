package BasicPrograms;

public class Condition5 {
	public static void main(String args[]) {
		int b=67;
		System.out.println(b%10==7);
		System.out.println(b%10==9);
		if(b%10==7) {
			System.out.println("Number ends with either 7 or 9");
		}else{
			System.out.println("Number does not end with either 7 or 9");
		}
	}

}
