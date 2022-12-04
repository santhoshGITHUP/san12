package INTERVIEW_JAVA_Q;

import java.util.Scanner;

public class number_swapping {
  public static void main(String[] args) {
	  int a, b, c;
	  System.out.println("please enter the number");
	  Scanner scan = new Scanner(System.in);
	   a = scan.nextInt();
	   b= scan.nextInt();
	   
	  c=a;
	  a=b;
	  b=c;
	  
	   System.out.println(a);
	   System.out.println(b);
}
}
