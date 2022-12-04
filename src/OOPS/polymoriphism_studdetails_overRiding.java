package OOPS;

import java.util.Scanner;

public class polymoriphism_studdetails_overRiding {
  public static void main(String[] args) {
	  studentinfo s1 = new studentinfo();
	// System.out.println("enter the exam code..");
	
		//Scanner scan = new Scanner(System.in);
		// int Examcode = scan.nextInt();	   
		   s1.writeExam(2);
		   senoiorstudent se = new senoiorstudent();
		   se.writeExam(2);
		   
		    //s1.writeExam(123);
	       // s1.examcode(345);			   
	}                                                        //over loading
	}
	   class studentinfo {
		   public void writeExam() {
			   System.out.println("student writting a exam...");
		   }
		   public void writeExam(String subjest) {
			   System.out.println("student writting "+subjest+" exam");
		   }
		  public void examcode(int code) {
			  int examcode=345;
			  System.out.println("exam code is science");
		  }
		   public void writeExam(int Examcode) {
			   switch(Examcode) {
			   case 1:  {
				   System.out.println("student writtingexam is DS...");
			   break;
			   }
			   case 2: {
				   System.out.println("student writtingexam is DSP...");
				   break;
			   }
			   default: {
				   writeExam();
				   break;
			   }	
			      }
			  
		   
}
}
	   
	   /// using over riding.....
	   class senoiorstudent extends studentinfo {
		   
		   
		   
		  
	      @Override   //  <------ /// type on "write"....c+space
		public void writeExam(int Examcode) {
	    	   switch(Examcode) {
			   case 1:  {
				   System.out.println("student writtingexam is AWS...");
			   break;
			   }
			   case 2: {
				   System.out.println("student writtingexam is JAVA ...");
				   break;
			   }
			   default: {
				   writeExam();
				   break;
			   }
		   }
		}  
	   }
	   
	   
	   
	   
	   