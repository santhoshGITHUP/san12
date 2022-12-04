package ARRAY;

import java.util.Scanner;

public class Array_sorting {
	public static void main(String[] args) {
		int[] number = new int[5];
		System.out.println("please enter the number...");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		// bubble sort
		// 4,2,7,6,1
		// 2,4,7,6,1
		// 1,4,7,6,2-->0th smallest number
		// 1,2,7,6,4--.1st smallest number
		// 1,2,6,7,4
		// 1,2,4,7,6
		// 1,2 4,6,7'
		int swapCount = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					// swapping
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					swapCount++;
				}
			}
		}

		System.out.println("To sort the array " + swapCount + " swapping required");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("Using for each");
		for (int i : number) {
			System.out.println(i);
		}
	}

}
