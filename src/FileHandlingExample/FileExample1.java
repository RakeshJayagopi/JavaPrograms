package FileHandlingExample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample1 {
public static void main(String[] args) throws IOException {
	File file=new File("Document.txt");
	boolean isPresent=file.exists();
	if(isPresent==true) {
		System.out.println("File is present");
	}
	else {
		System.out.println("File is absent");
		file.createNewFile();
	}
//	FileWriter writer=new FileWriter(file);
//	writer.write("Hello");
//	writer.close();
//}
//}
	FileReader reader=new FileReader(file);
	System.out.println((char)reader.read());
	int j;
	while((j=reader.read())!=-1) {
		System.out.println((char) j);
	}
	reader.close();
}
}
