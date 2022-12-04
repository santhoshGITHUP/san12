package COLLECTION;

import java.util.Stack;

public class STOCK_condition {
   public static void main(String[] args) {
	Stack<Integer> sl = new Stack<>();
	sl.add(7);
	sl.add(5);
	sl.add(1);   //11  ///111
	sl.add(2);
	sl.add(4);
	sl.add(9);
	//sl.add(2, 11);
	//sl.set(2, 111); 
	//sl.push(3);   // add the push - 3

	while(sl.size()>0) {
	    System.out.println(sl.pop());	
	   
	}
   }
}
