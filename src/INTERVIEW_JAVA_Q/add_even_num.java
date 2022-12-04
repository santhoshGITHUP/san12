package INTERVIEW_JAVA_Q;

import java.util.Scanner;

public class add_even_num {
  public static void main(String[] args) {
	  // ex:1     add and even number....
	       int count=0;
	       for(int i=0;i<=100;i++) {
	    	   if(i%2==1) {
	    		   count=count+1;
	    	   }
	    	   System.out.println(count);
	       }
	       System.out.println("to find add number even number.....");
	       System.out.println("please enter the number...");
	       Scanner scan = new Scanner(System.in);
	       int n = scan.nextInt();
	       if(n%2==0) {
	    	  System.out.println("this number is add number"); 
	       }  else {
	    	   System.out.println("this number is even  number");
	       }
}
}
