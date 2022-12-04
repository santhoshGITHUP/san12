package OOPS;


public class constructorex2 {
	String stunent_name;
	int Student_mark;
	String student_sub;
	float Student_avgScore;
	long student_phoneNumber;
	
	
	constructorex2(String name,int mark,String sub,float avgScore,long phoneNum){
		stunent_name=name;
		Student_mark=mark;
		student_sub=sub;
		Student_avgScore=avgScore;
		student_phoneNumber=phoneNum;
//		System.out.println(name);
//		System.out.println(mark);
//		System.out.println(sub);
//		System.out.println(avgScore);
//		System.out.println(phoneNum);
	}
	  private void studentDetails() {
		System.out.println("student name is: "+stunent_name+"\n"+"student mark is:"
				+ " "+Student_mark+"\n"+"student subject is: "+student_sub+"\n"+"student average score is: "
						+ ""+Student_avgScore+"\n"+"student phone number is: "+student_phoneNumber );

	}
	
	
	
       public static void main(String[] args) {
    	   
    	   constructorex2 c= new constructorex2("santhosh", 28, "maths", 286.4f, 9942325l);
    	   c.studentDetails();
    	   System.out.println("\n");
    	   constructorex2 c2= new constructorex2("sanjai", 27, "science", 435.45f, 5464325899l);
    	   c2.studentDetails();
    	   
    		  }
}


    	   
    	  