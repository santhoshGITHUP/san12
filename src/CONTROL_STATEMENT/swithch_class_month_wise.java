package CONTROL_STATEMENT;

import java.util.Scanner;

public class swithch_class_month_wise {
	public static void main(String[] args) {
		System.out.println("please enter month");
System.out.println("1.January 2.February 3.March 4.April 5.May 6.june 7.july 8.August 9.Setemb 10.Oct 11.Novem 12.dec  ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month) {
		case 1:{
			System.out.println("month is January");
			break;
		}
		case 2: {
			System.out.println("month is February");
			break;
		}
		case 3: {
			System.out.println("month is March");
			break;
		}
		case 4:  {
			System.out.println("month is April");
			break;
		}
		case 5:  {
			System.out.println("month is May");
	
			break;
		}
		case 6:  {
			System.out.println("month is june ");
			break;
		}
		case 7:   {
			System.out.println("month is July");
			break;
		}
		case 8:   {
			System.out.println("month is August");
			break;
		}
		case 9:   {
			System.out.println("month is Setemb");
			break;
		}
		case 10:   {
			System.out.println("month is Oct");
			break;
		}
		case 11:   {
			System.out.println("month is Novem");
			break;
		}
		case 12:  {
			System.out.println("month is dec");
			break;
		}
			
		default: {
			System.out.println("invailed");
		}
		
		}
		
		
	}
}
