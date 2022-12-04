package EXCEPTION_HANDLING;

import java.util.Scanner;

public class name_length_ex2_exception {
         public static void main(String[] args) {
        	 Scanner get = new Scanner(System.in);
     		System.out.println("Enter the name: ");
     		String name = get.nextLine();
     		get.close();
     		System.out.println("Name: " + name);

     		System.out.println("Length of the name: " + name.length());
     		try {
     			//File open
     			System.out.println("First 3 letters of the name: " + name.substring(0, 3));
     			
     			// file reads
     			//file close
     		} catch (StringIndexOutOfBoundsException e) {
     			System.err.println(e.getMessage());
     			// e.printStackTrace();
     			System.err.println("Error: the length of the given string is small than the substring required");
     		} finally {
     			
     			// resource closure..
     			// file closing..
     			System.out.println("Always execute..");
     		}

     		System.out.println("Program ends normally..");
		}
}
