package COLLECTION;

import java.util.HashMap;
import java.util.Map;

public class MAP_condition_Student_AllData {
    public static void main(String[] args) {
	     Map<Integer, student> map = new HashMap<>();
	  
	     map.put(123, new student(123,"senthil","4/2/1999","9942978432",90));
	     map.put(345, new student(345,"santhosh","20/3/2000","9987644",70));
	     map.put(456, new student(456,"siva","8/8/2001","99979869",70));
	     map.put(678, new student(678,"sanjai","14/12/1999","98765123",80));
	     map.put(891, new student(891,"venket","4/9/1999","9942000432",99));
	    // System.out.println(map.get(123));   // single data print condition
	     System.out.println("student all data show.....");
	     System.out.println("ID \tname\tDob  \tphone \tmark");
	     System.out.println("-------------------------------------");
	     for(Integer key:map.keySet()) {
	    	 System.out.println(map.get(key));
	     }
	}
}
  class student {
	  int id;
	  String Name;
	  String dob;
	  String phone;
	  int mark;
	public student(int id, String name, String dob, String phone, int mark) {
		super();
		this.id = id;
		Name = name;
		this.dob = dob;
		this.phone = phone;
		this.mark = mark;
	}
	@Override
	public String toString() {   // this method is to string method  
		//return super.toString();
		return id+" \t "+Name+"\t"+dob+"\t"+phone+"\t"+mark;
	}
	  
  }