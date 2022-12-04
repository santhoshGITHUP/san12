package FUNCTION;

import java.util.Scanner;

public class ex_2_add_number {
 static Scanner get = new Scanner(System.in);
    public static void main(String[] args) {
		int r=add(getNumber1(),getNumber2(),getNumber3());
		System.out.println(r);
	}
            public static int getNumber1()    {
            System.out.println("enter the num1");
            return get.nextInt();
            }
         public static int getNumber2() {
        	 System.out.println("enter the num2");
        	 return get.nextInt();	
    }
         public static int getNumber3()  {
        	 System.out.println("enter the num3");
        	 return get.nextInt();
        	 
         }
public static int add(int x,int y,int z)    {
	return x+y+z;
	
}
}
