package LOOPS;

import java.util.Scanner;

public class wegr {
  public static void main(String[] args) {
	  System.out.println("please enthe number");
	  Scanner scan= new Scanner(System.in);
	   int num= scan.nextInt();
	   int  sum=0;
	   for(int i=1;i<=num;i++) {
		   System.out.print(i+"+");
		   sum=sum+i;
		   if(sum!=num) {
			   System.out.print("+");
		   }
		   
	   }
	   
	   System.out.print("="+sum);
}
}
