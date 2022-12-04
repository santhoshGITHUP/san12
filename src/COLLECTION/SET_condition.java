package COLLECTION;

import java.util.HashSet;
import java.util.Set;

public class SET_condition {
   public static void main(String[] args) {
	     Set<Integer> set = new HashSet<Integer>();
	     //int arr[] = new int[] {45,64,2,3,7,21,11,98,12,13,9};
	     int arr[] = new int[] {32,69,16,58,5,7,21,33,16,7};
	     
	     // for(int i =1; i<15;i++) {
             //   set.add(i);	      }
	     // for(Integer i:set) {
	    	//  System.out.println(i);
	    //  }
	     System.out.println("  ");
	     System.out.println("using array condition...");
	      
	     for(int i =0; i<arr.length;i++) { 
	    	 set.add(arr[i]);
	      }
	      for(Integer i:set) {
	    	  System.out.println(i);
	      }
}
}
