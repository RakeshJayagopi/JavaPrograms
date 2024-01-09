package ExceptionHandlingPackage;

public class CheckedExceptionExample2 {

	static void work() throws IllegalAccessException
{
	System.out.println("Inside work(). ");
		throw new IllegalAccessException("demo");
		}
		public static void main(String args[])
		{
		try {
			work();
		}
		catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}
}
