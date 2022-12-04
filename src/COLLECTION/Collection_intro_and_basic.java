package COLLECTION;

import java.util.ArrayList;

public class Collection_intro_and_basic {
    public static void main(String[] args) {
    	//  ***IMPORNT ponit***
    	
    	//***instruction order-
    	//***dublication
    	//***null
    	// array vs collection
	    // array supports primitive and non-primitive (object array)
	    // Collection -  all should be objects
	
	    // array needs size 
	   // collection - do not need to initialize size 
	
	    // array con's- size change - insertion, deletion difficult
	    // collection - auto shrink and grow size ..hence insertion and deletion 
	                    // can be done
  
	int arr[] = new int[4];
	arr[0] = 45;
	arr[1] = 48;
	arr[2] = 56;
	arr[3] = 67;
	//arr[4] = 78; error
	arr = new int[5];
	
	// wrapper class
	// converts primitive to object
	 // int  - Integer
	  // long - Long , float - Float,
	   // char - Character
	    // boolean - Boolean
	  
	int i=45;
	Integer j = Integer.valueOf(i);// manual
	Integer jj = i; //auto boxing
	int k = jj; //auto unboxing.
	
	// Collection
	   // - list, set, queue
	   // set uses map -> map
	   // list,set,queue,map -> interface
	    // list - arrayList,vector,Linkedlist,stack
	    // set -  Hashset,LinkedHashset,TreeSet
	    // queue - queuue,deque (LinkedList)
	    // map  -  HashMap,LinkedHashMap,TreeMap
	    // Hashset uses Hashmap
	     // LinkedHashSet uses LinkedHashMap 
	      // TreeSet - uses TreeMap
	ArrayList<Integer> list=new ArrayList<>();
	
	list.add(1);
	list.add(k);
	list.add(2);
	list.add(jj);
	System.out.println("size "+list.size());
	System.out.println(list);
	list.remove(0);
	System.out.println("after remove--------");
	System.out.println("size "+list.size());
	System.out.println(list);
	
	
	
	
	
	
	
	
	}
}
