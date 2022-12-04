package CONTROL_STATEMENT;

import java.util.Scanner;
    // nested condition

public class mark_exable {
    public static void main(String[] args) {
		  System.out.println("enter the mark...");
		  Scanner scan= new Scanner(System.in);
		  int mark=scan.nextInt();
		  
		  if(mark>=90) {
			  System.out.println("A grade");
		  } else if(mark>=80) {
			  System.out.println("B grade");
		  }else if(mark>=70) {
			  System.out.println("C grade");
		  }else {
			  System.out.println("fail");
		  }
	}
}
