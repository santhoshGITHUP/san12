package ARRAY;

public class two_dimensional_array {
	public static void main(String[] args) {
		String name[][] = { { "rajesh", "shankar" }, 
				            { "senthil", "kumar" }, 
				            { "bala", "vigneh" } };
		// simgle d= inde will be 0,1,2....
		// 2d =index will be 00.01...10,11...20,21...
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				// System.out.println(" index " + i + ""+j+ " value "+ name[i][j]);
				// System.out.println("remove the index and value...for my reff");
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}
	}
}

///   int [3][3]
//-> 
   