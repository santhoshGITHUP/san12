package LOOPS;

import java.util.Scanner;

public class numer_pattern_sum {
      public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int sum=0;
		for(int a=1;a<=n;a++)  {
			System.out.print("(");
			for(int i=1;i<=a;i++) {
				
				System.out.print(i);
				if(i!=a) {
				System.out.print("+");
				}
				sum=sum+i;
		}
				System.out.print(")");
			
			if(a!=n) {
			System.out.print("+");
	}
		
}
		System.out.print("=" +sum);     
}
      }
