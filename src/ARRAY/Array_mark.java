package ARRAY;

public class Array_mark {
	public static void main(String[] args) {
		int[] mark = new int[5];
		int[] age = { 23, 34, 76, 98, 21 };
	     mark[0] = 23;
		mark[1] = 32;
        mark[2] = 45;
		mark[3] = 56;
		mark[4] = 56;
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
		}
		System.out.println("age---------");
		for( int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		System.out.println("  find the senior age ........");
		int seniorage = age[0];
		for (int i = 0; i < age.length; i++) {
			if (age[i] > seniorage) {
				seniorage = age[i];
			int tem=seniorage;
			

			}
		}
		System.out.println("senior age is :" + seniorage);

	}
    }
