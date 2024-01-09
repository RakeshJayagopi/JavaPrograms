package ExceptionHandlingPackage;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		try {
			ArithmeticException a=new ArithmeticException();
//			explicit throw exception
			throw a;
		}
		catch(Exception e) {
			System.out.println("Code testing");
		}
		finally {
			System.out.println("Execute rest of the code");
		}
	}
}
