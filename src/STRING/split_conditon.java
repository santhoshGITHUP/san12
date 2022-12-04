package STRING;

public class split_conditon {
  public static void main(String[] args) {
	   //String name ="Santhosh kumar siva sandy kutty";
	   // String result[]=name.split(" ");
	  String name ="Santhosh*kumar*siva*sandy*kutty";
	   String result[]=name.split("\\*");
	  
	   for(String re:result) {
		   System.out.println(re);
	   }
}
}
