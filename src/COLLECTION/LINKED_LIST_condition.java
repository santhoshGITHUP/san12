package COLLECTION;

import java.util.LinkedList;

public class LINKED_LIST_condition {
          public static void main(String[] args) {
        	  System.out.println("LINKED LIST CONDITION-----");
			 LinkedList<Integer> Llist =  new LinkedList<>();			 
			 Llist.add(7);     
			 Llist.add(5);    
			 Llist.add(1);
			 Llist.add(2);
			 Llist.add(4);
			 Llist.add(9);
			  Llist.push(3);
			// Llist.set(1, 50);/// Llist.add(50);--- condition show 
			// Llist.add(1, 100);  /// Llist.add(100);---- condtion add with array
			      // 
			 while(Llist.size()>0) {
				 System.out.println(Llist.pop());
			 }
			// System.out.println("randomly addd number of 11 to 20 range---");
			
		}
}  
