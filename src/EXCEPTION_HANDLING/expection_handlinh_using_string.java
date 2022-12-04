package EXCEPTION_HANDLING;

import java.util.Scanner;

public class expection_handlinh_using_string {
            public static void main(String[] args) {
			System.out.println("please enter the name...");
			Scanner scan= new Scanner(System.in);
			String name = scan.nextLine();
			char []ab = name.toCharArray();   // common--> to change string
	     	//int a = name.length();
			try {
				
				int a = name.length();
				System.out.println(name.substring(0,4));
			} catch(Exception E) {
				
				System.err.println("ERROR :"+E.getLocalizedMessage());
			}
		}
}	

