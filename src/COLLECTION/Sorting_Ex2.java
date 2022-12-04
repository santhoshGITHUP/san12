package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_Ex2 { // comparaable condition
	public static void main(String[] args) {
		ArrayList<person> list = new ArrayList<person>();
		list.add(new person(123, "Ram", 22));
		list.add(new person(576, "Sam", 25));
		list.add(new person(784, "Sam", 28));
		list.add(new person(154, "Sam", 21));
		list.add(new person(345, "Arun", 21));
		System.out.println("Before sorting..");
		for (person i : list) {
			System.out.println(i);
		}

		Collections.sort(list, new Namesorter(false));
		System.out.println("after sorting..");
		for (person i : list) {
			System.out.println(i);
		}

	}

}

class Agesorter implements Comparator<person> {

	@Override
	public int compare(person o1, person o2) {
		// TODO Auto-generated method stub
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age < o2.age) {
			return -1;
		} else {
			return 0;
		}
	}

}

class Namesorter implements Comparator<person> {

	boolean isAsc;

	Namesorter(boolean isAsc) {
		this.isAsc = isAsc;
	}

	@Override
	public int compare(person o1, person o2) {

		int re;
		if (isAsc) {
			re = o1.name.compareTo(o2.name);
		} else {
			re = o2.name.compareTo(o1.name);
		}
		if (re != 0) {
			return re;
		} else {
			if (o1.age > o2.age) {
				return 1;
			} else if (o1.age < o2.age) {
				return -1;
			} else {
				return 0;
			}
		}
	}

}

class person implements Comparable<person> {
	int id;
	String name;
	int age;

	public person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(person o) {
		if (id > o.id) {
			return -1;
		} else if (id < o.id) {
			return 1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return id + " " + name + " " + age;
	}
}
