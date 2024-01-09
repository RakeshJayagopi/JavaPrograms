package ExceptionHandlingPackage;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("Rest of the code");
		}
		finally {
			System.out.println("Program complete");
		}
	}
}
