package ARRAY;

public class second_largest_number {
     public static void main(String[] args) {
		int[] age={23,45,76,87,100};
		
		int seniorage=age[0];
		int secondseniorage=0;
		for(int i= 0;i<age.length;i++) {
			if(age[i]>seniorage) {
				seniorage=age[i];
				//int tem=age[i];
			
				
			
			}
		   			
		}
		System.out.println("senior age is "+seniorage);
		
     }
}
