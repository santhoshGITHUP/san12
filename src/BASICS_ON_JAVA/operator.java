package BASICS_ON_JAVA;

public class operator {                 
	                              // unary operator
	
	
	   public static void main(String[] args) {
		int a= 10; 
		a++;
	    ++a;
	    
		a++;     // post increment
		++a;     // pre increment
		a--;
		int b = ++a;
		System.out.println("a is "+a++);
		System.out.println("b  is "+ b);
		System.out.println(a+ ++b + ++a);
		
		
		int max = (a<b?a:b);
		System.out.println(7>9? "hellow": "hai" );
		
		
		
	}
	
}




