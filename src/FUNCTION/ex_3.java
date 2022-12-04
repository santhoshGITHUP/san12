package FUNCTION;

import java.util.Scanner;

public class ex_3 {

	static int i = 1;
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		mymethod(N);		
	}
	public static void mymethod(int N) {
		System.out.println(i);
		i++;
		if(i<=N) {
			mymethod(N);
		}		
	}
}


