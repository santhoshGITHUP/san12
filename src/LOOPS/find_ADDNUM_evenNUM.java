package LOOPS;

import java.util.Scanner;

public class find_ADDNUM_evenNUM {
   public static void main(String[] args) {
	   System.out.println("please enter the number...");
	   Scanner scan= new Scanner(System.in);
	   int n = scan.nextInt();
	   int count=0;
	   for(int i= 1;i<=n;i++) {
		 //  if(i%2==0) {    // find the even number
			   if(i%2==1) {    // find the odd number
				   count=count+i;
			   //System.out.println(i);
		   }
	   
}
	   System.out.println(count);  // sum of the odd number..
	   }
}