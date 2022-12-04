package FILE_HANDLING;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class create_File_and_content_write_function {
   public static void main(String[] args) {
	   String path="c://java_file";
	File f = new File(path);
	if(f.mkdirs()) {
		System.out.println("file can be created...");	
	} else {
		System.out.println("unable to create folder...");
	}
	//f.delete();
	f.getTotalSpace();
	System.out.println(f.getTotalSpace());
	 
	File file = new File(path+f.separator+"testfile.txt");//<--syntax
	System.out.println(file.toPath());
	try {
		FileWriter write = new FileWriter(file);
		write.write("hello this is");
	   write.close();
		
		System.out.println("content has been saved...");
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println();
}
}
