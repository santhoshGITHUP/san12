package LOOPS;

import java.util.Scanner;

public class do_whileLoop {
 public static void main(String[] args) {
	  System.out.println("enter the number...");
	  Scanner scan= new Scanner(System.in);
	  int n= scan.nextInt();
	  int k=0;
	  do {
		  
		  System.out.println("hai.");
		  k++;
	  } while(k<n);
	  System.out.println("end");
}
}
