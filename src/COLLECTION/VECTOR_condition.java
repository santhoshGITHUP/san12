package COLLECTION;

import java.util.Iterator;
import java.util.Vector;

public class VECTOR_condition {
   public static void main(String[] args) {
	   Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(4);
		vector.add(2);
		vector.add(9);
		vector.add(3, 45);     //<-  this condtionnis add to one array  number..
		vector.set(3,50);  //  <-  set the value of array number 3<- 50
		vector.contains(50);
		System.out.println("size " + vector.size());
		System.out.println(vector);
		//list.remove(0);
		System.out.println("after remove--------");
		System.out.println("size " + vector.size());
		System.out.println(vector);
		
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}

		System.out.println("For each");
		for(Integer i: vector) {
			System.out.println(i);
		}
		System.out.println("Iterator ...");
		Iterator<Integer> it = vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
}
}
