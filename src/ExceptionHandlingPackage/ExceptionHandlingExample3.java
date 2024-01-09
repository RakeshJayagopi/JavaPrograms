package ExceptionHandlingPackage;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {
		try {
			int b[]=new int[10];
			b[0]=100;
			int a=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Initialising & testing code");
		}
		catch(ArithmeticException c) {
			System.out.println("arithmetic exception");
		}
		finally {
			System.out.println("Program execution complete");
		}
	}
}
