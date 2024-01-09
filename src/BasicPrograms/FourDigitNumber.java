package BasicPrograms;

public class FourDigitNumber {
	public static void main(String args[]) {
		int e=8426;
		System.out.println(e%9999);
		if((e>1000)&&(e<9999)) {
			System.out.println("Number is a 4 digit number");
		}else {
			System.out.println("Number is not a 4 digit number");
		}
	}

}
