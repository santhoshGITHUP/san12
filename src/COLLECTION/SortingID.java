package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingID {
    public static void main(String[] args) {
    	
		 ArrayList<manager>list =  new ArrayList<>();
		 list.add(new manager(123,"santhos",90));
		 list.add(new manager(345,"mani",80));
		 list.add(new manager(567,"siva",95));
		 list.add(new manager(111,"santhish",85));
		 Collections.sort(list);
		 for(manager c1:list) {
			 System.out.println(c1);
		 }
	}
}
  class manager implements Comparable<manager> {
	  int id;
	  String name;
	  int mark;
	public manager(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
    
    
    @Override
    public int compareTo(manager o) {
    	if(id>o.id) {
    		return 1;
    	}else if(id<o.id) {
    		return -1;
    	}else {
    	return 0;
    	}
    }
    public String toString() {
    	return id+" "+name+" "+mark;
    }
  }