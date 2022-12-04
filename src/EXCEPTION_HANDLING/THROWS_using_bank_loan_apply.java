package EXCEPTION_HANDLING;

public class THROWS_using_bank_loan_apply {
    public static void main(String[] args) {
    	  custmer c = new custmer();
    	  
    	  c.name="santhosh";
    	  c.age=20;
    	  c.getscore(60);
    	  try {
			applyloan(c);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
    	
    }
      public static String applyloan(custmer c) throws Exception {
    	  String name="";
    	  if(c.age<17) {
    		 name="FAILED: age is under limit"; 
    		 throw new Exception(name);
    	  }
    	  if(c.score<50) {
    		  name="FAILED: scoreis below ";
    		  throw new Exception(name);
    		  
    	  }
    	  name=" bank loan apply sucessfully";
		  

    	  return name;
      }
} 
 class custmer {
	 String name;
	 int age;
	 int score;
	 public void getscore(int score) {
		 this.score=score;
	 }
 }