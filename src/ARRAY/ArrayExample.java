package ARRAY;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.MyUtil;

public class ArrayExample {
	public void methods() {
		int[] num=new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++) {
			num[i]= MyUtil.getScanner().nextInt();
		}
		System.out.println("Enter numbers are....");
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
	
		int[] number = new int[3];

		number[0] = 45;
		number[1] = 56;
		number[2] = 78;
		System.out.println(Arrays.toString(number));


		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println("Length:"+number.length);

		String names[] = { "Senthi", "Santhosh", "Arun", "Magesh" };

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println("length:"+names.length);
		
		System.out.println("--------------------");
		int[] num=new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++) {
			num[i]= MyUtil.getScanner().nextInt();
		}
		System.out.println("Enter numbers are....");
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		

	}
}
