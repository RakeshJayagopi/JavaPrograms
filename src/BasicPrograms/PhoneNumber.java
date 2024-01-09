package BasicPrograms;

public class PhoneNumber {
	public static void main(String args[]) {
		long f=8754558840l;
		System.out.println(f%9999999999L);
		if((f>=1000000000)&&(f<9999999999L)) {
			System.out.println("This number is a phone"+f+" number");
		}else {
			System.out.println("This number is not a phone"+f+" number");
		}
	}

}
