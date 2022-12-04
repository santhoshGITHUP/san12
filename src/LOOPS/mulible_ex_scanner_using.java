package LOOPS;

import java.util.Scanner;

public class mulible_ex_scanner_using {
public static void main(String[] args) {
	System.out.println("please enter the number");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for(int i = 1;i<=20;i++) {
		int k =n*i;
		//System.out.println(n+ "X" +i+" = " +(n*i) );
		System.out.println(n+ "X"+i+"=" +k);
	}
	
	   
}
}
