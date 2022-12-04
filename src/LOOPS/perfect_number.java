package LOOPS;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
    	System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
			   sum = sum + i;	
			}
		}
		if(sum==n) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not a perfect number");
		}
	}
}

	

