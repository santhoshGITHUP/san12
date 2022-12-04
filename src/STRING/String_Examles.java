package STRING;

public class String_Examles {
  public static void main(String[] args) {
	     String nameobje1= new String("santhosh");
	     String nameobje2= new String("santhosh");
	     String namelit1 = "santhosh";
	     String strLarge="      i am santhosh kumar.i am       living in chennai....         ";
	     String email="pvsanthoshsandy@gamil.com";
	     String namelit2 = "Santhosh"; 
	     String str= "i am santhosh";
	     System.out.println(namelit1==namelit2);   // true
	     System.out.println(nameobje1==nameobje2);  // false	        
	    System.out.println(nameobje1.equals(namelit2));// true
	    System.out.println(namelit2.equalsIgnoreCase(namelit1));// false-compare to 1st letter-santhosh
	    System.out.println("-------------------------------");
	    System.out.println(namelit1+"length is "+namelit1.length());
	    System.out.println("char at 3"+str.charAt(3));// m
	   // System.out.println("last index of I"+str.lastIndexOf(4));
	    System.out.println("\nEmpty----------");
	     System.out.println( "is empty"+str.isEmpty());
	     System.out.println("substring"+str.substring(3));
	     System.out.println("substring 2 range"+str.substring(2, 6));
	     System.out.println("contains"+str.concat("san"));
	     System.out.println("concat"+str.concat("sandy"));
	     System.out.println("Trim before"+strLarge);
	     System.out.println("trime after"+strLarge.trim());
	     System.out.println("replace "+strLarge.replace("am", "AM"));
	     System.out.println("replace all:"+email.replaceAll("[a-z]", "x"));
	     System.out.println("email :"+"XXXX".concat(email.substring(4)));
	     System.out.println("compare to :"+"z".compareTo("a"));
	    System.out.println("start with:"+str.startsWith("i"));
	    System.out.println("end with:"+str.endsWith("mar"));
	    System.out.println("lower:"+str.toLowerCase());
	    
	    
	    
}
}

