package ARRAY;

import java.util.Scanner;

public class ddd{
public static void main(String[] args) {
 int ar[]=new int[5];
 System.out.println("Enter the number");
 Scanner sc= new Scanner(System.in);
// int nextInt = sc.nextInt();
 for(int i=0;i<ar.length;i++) {
	 ar[i]=sc.nextInt();
 }
 for(int i=0;i<ar.length;i++) {
	 System.out.println(ar[i]);
 }
}
}
