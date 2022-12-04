package LOOPS;

import java.util.Scanner;

public class skip_the_particular_number {
  public static void main(String[] args) {
	   System.out.println("please enter the number");
	   Scanner scan = new Scanner(System.in);
	   int n= scan.nextInt();
	   for(int i=1;i<=n;i++) {
		   if(i==7) {
			//   break;//  break the value,to given data dont enter the remaining data
			   continue;   // dont disply the particular number
		   }
		   System.out.println(i);
	   }
	   
}
}
