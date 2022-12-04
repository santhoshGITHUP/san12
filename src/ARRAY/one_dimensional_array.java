package ARRAY;

public class one_dimensional_array {
	public static void main(String[] args) {
		String name[] = { "santhosh", "siva", "sandy" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(" index " +" "+ + i + "  value  " + name[i]); // one dimensional array
		}
		
		for(String s: name) {
			System.out.println(s);
		}
	}
}
