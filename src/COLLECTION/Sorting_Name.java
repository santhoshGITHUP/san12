package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_Name {
   public static void main(String[] args) {
	 ArrayList<supervisor>s= new ArrayList<supervisor>();
	 s.add(new supervisor(123,"santhos",90));
	 s.add(new supervisor(345,"mani",80));
	 s.add(new supervisor(567,"siva",95));
	 s.add(new supervisor(111,"santhish",85));
	 Collections.sort(s,new Namesorter());
	 for(supervisor ss:s) {
		 System.out.println(ss);
	 }
}
}
  class supervisor implements Comparable<supervisor>{  // <---using id comparator

	  int id;
	  String name;
	  int mark;
	public supervisor(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return id +" "+name+""+mark;
	}
	@Override
	public int compareTo(supervisor o) {
		if(id>o.id) {
			return 1;
		}
		if(id<o.id) {
			return -1;
		}else {
		
			return 0;
		
		}
	}   
  }
  class Namesorter implements Comparator<supervisor>{

		@Override
		public int compare(supervisor o1, supervisor o2) {
			return 0;
		}
		   
	   }
  