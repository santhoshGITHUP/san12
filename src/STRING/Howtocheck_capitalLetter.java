package STRING;

import java.util.Scanner;

public class Howtocheck_capitalLetter {
  public static void main(String[] args) {
	  System.out.println("enter the message...");
	  Scanner  scan = new Scanner(System.in);
	    String mesg= scan.nextLine();
	    char c[]=mesg.toCharArray();
	    int capsum=0;
	    for(char c1:c) {
	    	if(c1>='A' && c1<='Z') {
	    		capsum++;
	    	}
	    	System.out.print(c1);
	    }
	    System.out.println("\ncapsum:" +capsum);
}
}
