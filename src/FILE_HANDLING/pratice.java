package FILE_HANDLING;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class pratice {
	
	 static File f=null;
   public static void main(String[] args) {
	   
	    File f = new File(path);
	    f.mkdirs();
	    System.out.println("folder can be created...");
	       System.out.println("write condition...");
	       read();
	       
	 
}
   public static void write() {
	      File file = new File(path+f.separator+"text.txt");
	       System.out.println(file.toPath());
	       Scanner scan = new Scanner(System.in);
	       System.out.println("please enterthe message...");
	       String mesg= scan.nextLine();
	       try {
			FileWriter writer= new FileWriter(file);
			writer.write(mesg);
			writer.close();
			System.out.println("saved...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
   }
   public static void read() {
	   StringBuffer buff= new StringBuffer();
	      File file = new File(path+f.separator+"testfile.txt");
	       System.out.println(file.toPath());
	       
	       try {
			FileReader reader= new FileReader(file);
			while(true)
				int i = reader.read();
			if(i==-1) {
				break;
			}
			buff.append((char)i);
			
			System.out.println("saved...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       System.out.println(buff.toString());
   }
}
