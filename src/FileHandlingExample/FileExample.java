package FileHandlingExample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
public static void main(String[] args) throws IOException {
	
	File file=new File("text.txt");
//	System.out.println(file.exists());
//	boolean isPresent=file.exists();
//	if(isPresent==true) {
//		System.out.println("file is present");
//	}
//	else {
//		System.out.println("file is not present");
//		file.createNewFile();
//	}
//	FileWriter writer=new FileWriter(file);
//	writer.write("Hello");
//	writer.close();
//}
//}
//	Scanner myReader = new Scanner(file);
//	while(myReader.hasNextLine()) {
//		String data = myReader.nextLine();
//		System.out.println(data);		
//}
//	myReader.close();
	FileReader reader=new FileReader(file);
//	System.out.println((char)reader.read());
	int i;
	while((i=reader.read())!=-1) {
		System.out.println((char)i);
	}
	reader.close();
}
}