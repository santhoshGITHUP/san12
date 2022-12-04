package EXCEPTION_HANDLING;

public class null_pointer_exception {
   public static void main(String[] args) {
	   String name=null;  // null pointer ex..
	   String name1="santhosh";
	   
	   try {
		   System.out.println("Length of the nameis   :"  +name.length());
		   System.out.println("char is:"   +name1.charAt(4));
	   }catch(Exception e) {
		    // System.out.println(e.getLocalizedMessage());
		     System.err.println("somthing went wrong length");
		     System.err.println("length is very lone one..");
	   }
}
}
