package EXCEPTION_HANDLING;

public class THROWS_licenseApply {
      public static void main(String[] args) {
    	  person p = new person();
    	  p.age=19;
    	  p.name="santhosh";
    	  p.settestscore(40);
    	 

		  try {
			getDrivinglicense(p);
		} catch (Exception e) {
			
         System.err.println(e.getLocalizedMessage());		
         }
			applyForDriverPost();
	    }
    	  public static void applyForDriverPost() {
		
	}
        public static String getDrivinglicense(person p) throws Exception  {
        	String name= "";
        	if(p.age<17) {
        		name="failed:  age is under limit";
        		throw new Exception(name);
        		
        	}
        	if(p.score<59) {
        		name="failed:  score below 60";
        		
        		return name;
        	
        	}
        	name="success:  lience approved";
        	return name;
        	
        }
        } 
                // create own custum classs
    
    
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
        
 