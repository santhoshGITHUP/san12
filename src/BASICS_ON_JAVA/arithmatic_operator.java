package BASICS_ON_JAVA;

public class arithmatic_operator {
public static void main(String[] args) {            // // arithmetic operator
	    int i = 6;
	    int j = 3;
	    System.out.println(i+j);
	    System.out.println(i-j);
	    System.out.println(i*j);
	    System.out.println(i/j);
	    System.out.println(i%j);  //remendor
	    
	      //relational opreator
	       System.out.println("relational oprator...");
	       System.out.println(i>j);
	       System.out.println(i==j);
	       System.out.println(i!=j);
	       System.out.println("logical opertor...");
	       //logical operator...
	       System.out.println(i>j && i==j);   //0 1=0    // true or false conditon
	          // assignment operator
	       System.out.println("assignment operator...");
	       i=4;
	       System.out.println(i);
	       //ternary operator....
	       System.out.println("ternary opertor");
	         int max=(i>j)?i:j;
	         System.out.println(max);
	         System.out.println(i>j?"hellow":"haai");
}

}  
