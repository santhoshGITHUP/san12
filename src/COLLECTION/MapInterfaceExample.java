package COLLECTION;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer, String>();
		
		map.put(123,"Santhosh");
		map.put(123,"Rajesh");
	    map.put(453,"Magesh");
	    map.put(909,"Ram");
	    map.put(919,"Ganesh");
	    map.put(345,"Chandran");
	    Set<Integer> keys=map.keySet();
	    for(Integer key: keys) {
	    System.out.println(map.get(key));
	    }
	    
	    System.out.println(map.get(453));
	}
}
