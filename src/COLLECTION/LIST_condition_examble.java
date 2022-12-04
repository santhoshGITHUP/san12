package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class LIST_condition_examble {
    public static void main(String[] args) {
    	ArrayList<Integer> list = new ArrayList<>();   //object

		list.add(1);
		list.add(4);
		list.add(2);
		list.add(9);
		list.add(3, 45);     //<-  this condtionnis add to one array  number..
		list.set(3,50);  //  <-  set the value of array number 3<- 50
		list.contains(50);
	    
		System.out.println("size " + list.size());
		System.out.println(list);
		//list.remove(0);
		System.out.println("after remove--------");
		System.out.println("size " + list.size());
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		System.out.println("For each");
		for(Integer i: list) {
			System.out.println(i);
		}
		System.out.println("Iterator ...");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		 
	}
}
