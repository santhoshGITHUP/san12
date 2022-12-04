package LOOPS;

import java.util.Scanner;

public class examble_sum {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner scan = new Scanner(System.in);
	int n =  scan.nextInt();
	
	   int sum = 0;
	   for(int i = 1; i<=n; i++) {
		   sum = sum+i;
		   System.out.print(i);  // system.out print(i+  "+")
		   if(i!=n) {
			   System.out.print("+");
		   }		   		 	   
	   }
	   System.out.println("="+sum);
	
	
}

}