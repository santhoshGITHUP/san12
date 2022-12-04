package LOOPS;

import java.util.Scanner;

public class number_pattern_sum_Ex2 {
	     public static void main(String[] args) {
			System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		int num=n;
		int reversesum=0;
		while(num>0)  {
			int rem=num%10;
			reversesum=reversesum*10+rem;
			num=num/10;
			
		}
		System.out.println();
	     }
	     
}


		
		
	     

