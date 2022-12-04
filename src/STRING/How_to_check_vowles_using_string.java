package STRING;

import java.util.Scanner;

public class How_to_check_vowles_using_string {
  public static void main(String[] args) {
	  System.out.println("please enter the message");
	   Scanner scan = new Scanner(System.in);
	   String mesg=scan.nextLine();
	    //String mesg = "Hellow all how Are you";  
          char c1[] = mesg.toLowerCase().toCharArray();
          int sum=0;
          for(char c:c1) {
        	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
        		  sum++;
        	  }
        	  System.out.print(c);
          }
	   System.out.print("\n there "+sum+" vowls present");

}
}
