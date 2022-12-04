package CONTROL_STATEMENT;

import java.util.Scanner;

public class ticker_fees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your age");
		int age =scan.nextInt();
		if(age>=60) {
			System.out.println("yout ticket fees is 350");
		}
		if(age<=59 && age>=31) {
			System.out.println("Your ticket fees is 200");

		}
		if(age<=32 && age>=26) {
			System.out.println("your ticket is 150");
		}
		if(age<=25 && age>=15)  {
			System.out.println("your ticket feees is 100");
		}
		if(age<=14 && age>=5)  {
			System.out.println("your ticket fees is 50");
		}  else {
			System.out.println("ticket no avable...");
		}




	}

}
