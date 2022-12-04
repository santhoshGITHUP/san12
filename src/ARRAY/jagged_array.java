package ARRAY;

public class jagged_array {
    public static void main(String[] args) {
		    int number[] []= new int[3][];
		    number[0]= new int[3];
		    number[1]= new int[4];
		    number[2]= new int[6];
		   // System.out.println(number[0].length);
		  //  System.out.println(number[2].length);
		    for(int i=0;i<number.length;i++) {
		    	for(int j=0;j<number[i].length;j++) {
		    		System.out.print(i+  "  "+j);
		    		
		    	}
		    	System.out.println();
		    	
		    }
		    System.out.println("      ");
		    for(int i=0;i<number.length;i++) {
		    	for(int j=0;j<number[i].length;j++) {
		    		number[i][j]=i*j;
		    		System.out.print(number[i][j]  +" ");
		    		
		    	}
		    	System.out.println();
		    	
		    }
	}
}
