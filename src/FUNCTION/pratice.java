package FUNCTION;

import java.util.Scanner;

public class pratice {
	static int i = 0;
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		mymethod(N);
		
	}
	
	public static void mymethod(int N) {
		i++;
		System.out.println(i);
		if(i<N) {
			mymethod(N);
		}		
	}
}
