package ExceptionHandlingPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionExample {
	
	public void fileHandling() {
		File f=new File("text.txt");
		try {
			FileWriter writer =new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args)  {
	
}
}
