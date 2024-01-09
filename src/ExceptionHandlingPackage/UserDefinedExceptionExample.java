package ExceptionHandlingPackage;
import	java.util.Scanner;

public class UserDefinedExceptionExample {

	public static void main(String[] args) throws EvenException {
		System.out.println("User defined Exception");
	        int j=20;
//	        System.out.println(j%2==0);
	        try {
	        	
	        if(j%2==0) {
	        	System.out.println("Number is even");
	        	EvenException e=new EvenException();
	        	throw e;
	        }else{
	        	System.out.println("Number is odd");
	        }
	        }
	        catch(EvenException e) {
	        System.out.println("Caught the exception"+e.getMessage());
	        }
		}
	}

