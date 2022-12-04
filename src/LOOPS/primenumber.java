package LOOPS;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
				int n = scan.nextInt();
				
				boolean isPrime = true;
				for(int i=2;i<n;i++) {
					
					if(n%i==0) {
						isPrime =  false;
						break;
					}
				}
				
				if(!isPrime) {
					System.out.println("Not a prime number");
				}else {
					System.out.println("Prime number");
				}
				
				
	}
}
