package OOPS_inheritance;

public class student_Using_inheritance {
   public static void main(String[] args) {
	   
	   student1 s= new student1 ();
	   s.std=12;
	   s.avg=70;
	   s.rank=2;
	   s.displaydetails();
	   employee1 e = new employee1();
	   e.name="siva";
	   e.position="SSE";
	   e.salary=12000f;
	   e.rating=70;
	   senioremployee se = new senioremployee();
	   se.name="santhosh";
	   se.petrolallowance=500;
	   
	   
}
 }
    class emp {   // base  
	   
  	String fatherName;
  	String motherName; 
	String street;
	String area;		
	}			 		
  
    class student1 extends emp {  //child class
    	
    	int std;
    	float avg;
    	int rank;  
    	public void displaydetails() {
    		System.out.println("std:" + std);
    		System.out.println("avg:"  +avg);
    		System.out.println("rank:" + rank);
    	//	System.out.println("fatherName:"  +fatherName);
    	}
    	
    		
    	
    	}
    
   
    class employee1 extends emp {       //child class   
    	String name;
    	String position;   	
    	float salary;
    	int rating;   
    }
    class senioremployee extends employee1  {
    	int petrolallowance;
    	}
    
    	