package LOOPS;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
  
    	System.out.println("enter the value");
    	Scanner scan =new Scanner(System.in);
    	int n = scan.nextInt();
      int num=n;
       int reversesum=0;
       while(num>0)  {
	   int r=num%10;
	reversesum=reversesum*10+r;
	num=num/10;
	
	
}
        System.out.println(reversesum);
}
}


	   
	  
	  
   

