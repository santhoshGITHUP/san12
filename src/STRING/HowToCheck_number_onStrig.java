package STRING;

import java.util.Scanner;

public class HowToCheck_number_onStrig {
  public static void main(String[] args) {
	System.out.println("please enter the messsge....");
	Scanner scan  = new Scanner(System.in);
	  String mesg=scan.nextLine();
	  char c1[] =mesg.toCharArray();
	  int num=0;
	  for(char c:c1) {
		  if(c>='0' && c<='9') {
			  num++;
		  }
		  System.out.print(c);
	  }
	  System.out.println("\n caps:"+num);
			  
}
}
