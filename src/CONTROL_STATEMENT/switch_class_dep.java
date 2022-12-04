package CONTROL_STATEMENT;

import java.util.Scanner;

public class switch_class_dep {
	public static void main(String[] args) {
		 System.out.println("enter the department");
		 System.out.println("1.cse 2.machinecal 3.ece");
	   Scanner scan = new Scanner(System.in);
	   int sub=scan.nextInt();
	   switch(sub) {
	   case 1: {
		   System.out.println("computer programming");
		   System.out.println("oops language");
		   System.out.println("basic of java");
		   
		   break;
	   }
	   case 2: {
		   System.out.println("basic of machine");
		   System.out.println("how to machione start logic");
		   System.out.println("motor logic");
		   break;
	   }
	   case 3: {
		   System.out.println("commucation tools");
		   System.out.println("electronic basic");
		   System.out.println("electric basic");
		   
	   }
	   default: {
		   System.out.println("invalid");
	   }
	  
			   
	   }
	    
	}
	


}
