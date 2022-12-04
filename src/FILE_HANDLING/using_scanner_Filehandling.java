package FILE_HANDLING;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class using_scanner_Filehandling {
  public static void main(String[] args) {
	  String path="c://javanew_ file";
	  File f = new File(path);
	  if(f.mkdirs()) {
		  System.out.println("file has been created..");
	  }  else {
		  System.out.println("unable to file");
	  }
	  System.out.println("please enter the content...");
	  Scanner scan= new Scanner(System.in);
	  String messg= scan.nextLine();
	  File file = new File(path+f.separator+"test file.html");
	  System.out.println(file.toPath());
	  try {
		FileWriter write = new FileWriter(file);
		write.write("\\n"+messg);
		write.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
          
}

