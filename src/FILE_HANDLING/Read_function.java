package FILE_HANDLING;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_function {
	static String path="c://javanew_ file";   // question
	  static  File f= null;                   // question
   public static void main(String[] args) {
		  
		  
		  File f = new File(path);
		  if(f.mkdirs()) {
			  System.out.println("file has been created..");
		  }  else {
			  System.out.println("unable to file");
		  }	
		 read();
		  
	}
   public static void write() {	  
		  File file = new File(path+f.separator+"test file.txt");
		  System.out.println(file.toPath());
		  System.out.println("please enter the content...");
		  Scanner scan= new Scanner(System.in);
		  String messg= scan.nextLine();
		  try {
			FileWriter write = new FileWriter(file,true);
			write.write("\\n"+messg);
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		
		}
   }
   public static void read() {
	   StringBuffer buff= new StringBuffer();
	   System.out.println("content the file-------");
	   File file = new File(path+f.separator+"test file.txt");		  		  
		  try {
			FileReader reader = new FileReader(file);
			while(true);
			int i= reader.read();    //question
			if(i==-1) {
				break;
			}
			buff.append((char)i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		  System.out.println(buff.toString());
		  System.out.println("file end...");
   }
	          
	}


