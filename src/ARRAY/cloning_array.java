package ARRAY;

import java.util.Arrays;

public class cloning_array {
	public static void main(String[] args) {
		int arr[] = { 25, 55, 6, 7 };
		System.out.println("printing the original array...");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("printing the clone array...");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);

		}
		System.out.println("Using array copy");
		int arrCopy[] = Arrays.copyOf(arr, arr.length);
		for (int i : arrCopy) {
			System.out.println(i);
		}
		System.out.println("Using =");
		int arrCopy2[] = arr;

		for (int i : arrCopy2) {
			System.out.println(i);
		}
		System.out.println("Changing copy2 arr");
		for (int i = 0; i < arrCopy2.length; i++) {
			arrCopy2[i] = 0;
		}
		for (int i : arr) {
			System.out.println(i);
		}
		

	}
}