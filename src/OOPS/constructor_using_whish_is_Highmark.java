package OOPS;

public class constructor_using_whish_is_Highmark {
  public static void main(String[] args) {
           student s1 = new student(1,"san"); 
            //  student.SchoolName="sss scholl";   // using static this condition
           s1.age=12;
    	   s1.avgscore=234.3f;
    	   s1.standard="tenth";
    	   s1.displaystudentdetails();
    	   student s2 =new student(2,"siva",18);
    	   s2.displaystudentdetails();
    	   student s3 =new student(3,"santhosh",20);
    	   s3.displaystudentdetails();
    	  
    	  // student nextstudent = comparestudent(s1,s2);
    	  // System.out.println("Next student is "+nextstudent.name);
       
  } 
  public static student comparestudent(student s1,student s2) {
	if( s1.id<s2.id) {
		return s1;
	}else {
		return s2;
	}
	  
	    
  }
  
       
}          

 class student {
	 int id;              // instance variable
	  String name;
	  String standard;
	  float avgscore;
	  int age;
    float avg;	     
    String std;
// static String SchoolName;  // usinng static this condition  //static variable
    public student(int _id, String _Name ) {
    	id = _id;        // local variable
    	name = _Name;
    	//displaystudentdetails(this);   /// this condition using
    }
    public student(int _id , String _Name, int _age) {
    	id = _id;
    	name = _Name;
    	age = _age;
    }
       public void displaystudentdetails() {
    	      System.out.println("id   :"  +id);
			  System.out.println("name   :"  +name);
			  System.out.println("age   :"  +age);
			  System.out.println("avgscore :"  +avgscore);
			  System.out.println("standard :"  +standard);
			 // System.out.println("SchoolName :"  +SchoolName); // using statics 
       }
         // THIS CONDITION USING
      // public void displaystudentdetails(student s) {
    	//   System.out.println("id   :"  +s.id);
		//	  System.out.println("name   :"  +s.name);
		//	  System.out.println("age   :"  +s.age);
		//	  System.out.println("avgscore :"  +s.avgscore);
		//	  System.out.println("standard :"  +s.standard); 
      // }
 
 } 
 
  
 

 