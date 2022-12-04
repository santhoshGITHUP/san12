package FUNCTION;

public class ex_1_add_sub_div_mul {
   public static void main(String[] args){
	    add();
	    sub(3,2);
	    System.out.println(2+"*"+3+"="+mul());
	    System.out.println(6+"/"+3+"="+div(6,3));	
	   // int getType=12;
	    System.out.println("seat type"   +getType(12));
}

  public static void add() {        // no return no parameter
	  int a=1;
	  int b=2;
	  System.out.println(a+"+"+b+"="+(a+b));	  
                           }
  public static void sub(int a,int b)  {       // no return with parameter
	  System.out.println(a+"-"+b+"="+(a-b));
                                       }
  public static int mul()  {        //return no parameter
	  int a=2;
	  int b=3;
	  return a*b;	  
                         }
  public static int div(int a,int b)  {    //return with parameter
	return a/b; 
  }
	public static String getType(int age) {
		if(age<=2) {
			return "infant";
		}else if(age<=12) {
			return "kid";
		}
	}
}        