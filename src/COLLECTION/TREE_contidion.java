package COLLECTION;

import java.util.Set;
import java.util.TreeSet;
   // tree set is a sorting condition....
public class TREE_contidion {
  public static void main(String[] args) {
	  Set<Integer> set = new TreeSet<Integer>();
	  int arry[] = new int[]{98,98,97,76,5,7,55,32,1,57,2};
	  for(int i =0;i<arry.length;i++) {
		  set.add(arry[i]);
	  }
	  for(Integer i: set) {
		  System.out.println(i);
	  }
}
}
