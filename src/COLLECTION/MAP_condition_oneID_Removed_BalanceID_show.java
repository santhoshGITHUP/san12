package COLLECTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_condition_oneID_Removed_BalanceID_show {
   public static void main(String[] args) {
	   Map<Integer, student> map = new HashMap<Integer, student>();  //
	     map.put(123, new student(123,"senthil","4/2/1999","9942978432",90));
	     map.put(345, new student(345,"santhosh","20/3/2000","9987644",70));
	     map.put(456, new student(456,"siva","8/8/2001","99979869",70));
	     map.put(678, new student(678,"sanjai","14/12/1999","98765123",80));
	     map.put(891, new student(891,"venket","4/9/1999","9942000432",99));
	     System.out.println("ID \tname  \tDob  \tphone \tmark");
	     System.out.println("-------------------------------------");
	     for(Integer Key:map.keySet()){
	    	 System.out.println(map.get(Key));
	     }
	     System.out.println("please enter the remove id...");
	  // map.remove(123);
	     Scanner scan = new Scanner(System.in);
	     int id = scan.nextInt();
	     if(!map.containsKey(id)) {     ///     trur or fale check-contains
	    	 System.out.println("student ID not found...");
	    	 
	    	 
	     }else {
	    	 map.remove(id);
	     }
	     System.out.println("ID \tname  \tDob  \tphone \tmark");
	     System.out.println("-------------------------------------");
	     for(Integer Key:map.keySet()){
	    	 System.out.println(map.get(Key));
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
	public String toString() {
		return id+"+Name+"+dob+"+phone+"+mark;
	}
  }