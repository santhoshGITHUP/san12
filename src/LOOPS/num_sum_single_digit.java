package LOOPS;

import java.util.Scanner;

public class num_sum_single_digit {
  public static void main(String[] args) {
	   System.out.println("enter the number...");
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int num = 5;
	  int addnum1=1;
	  int addnum2=0;
	  while(num>0) {
		  int r= num%10;
		  addnum1=addnum1+r;
		  num=num/10;
		  addnum2=addnum1%10;
		  num=num/10;
		  
		  
		  
	  }
	   System.out.println(addnum2);
}
}
