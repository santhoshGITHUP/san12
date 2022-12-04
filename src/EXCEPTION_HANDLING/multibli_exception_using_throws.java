package EXCEPTION_HANDLING;

public class multibli_exception_using_throws {
	public static void main(String[] args) {
  	  person p = new person();
  	  p.age=11;
  	  p.name="santhosh";
  	  p.score=7;
  	  String status;
		try {
		 getDrivinglicense(p);
		} catch (Exception e) {
			System.err.println( e.getLocalizedMessage());
		}
		     applyForDriverPost();
		}
  	  public static void applyForDriverPost() {
		
	}
      public static String getDrivinglicense(person p) throws Exception {
      	String name= "";
      	if(p.age<=17) {
      		name="";
      		throw new AgeUnderLimitExceptioin();
      		
      	}
      	if(p.score<=59) {
      		name="";
      		//throw new testscorenotmeetException();
      	}
      	name="success:  lience approved";
      	return name;
      	
      }
      } 
              // create own custum classs
class AgeUnderLimitExceptioin extends Exception {
	  public AgeUnderLimitExceptioin() {
		  super("failed:  age is under limit");
    	}
	  class testscorenotmeetException extends Exception {
		  public testscorenotmeetException() {
			  super("faild: below score...");
		}
	  }
	  
}
  
  
       class person {
      	   String name;
      	   int age;
      	   int score;
      	   public int gettestresult() {
      		   return score;
             	
             }
      	   public void settestscore(int score) {
      		   this.score = score;
      	   }
     }
    