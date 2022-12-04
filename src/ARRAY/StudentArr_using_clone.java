package ARRAY;

public class StudentArr_using_clone {

	public static void main(String[] args) {

		Student stuArr[] = new Student[2];
		stuArr[0] = new Student(123, "Raj", 23);
		stuArr[1] = new Student(143, "Sam", 22);

		Student s = new Student(132, "sdf", 3);
		try {
			Student s2 = (Student) s.clone();
			s2.age = 34;
			System.out.println(s.age);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Student s3 = s.getClone();

		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].name);
		}
		System.out.println("Using for each");
		for (Student student : stuArr) {
			System.out.println(student.id + " " + student.name + " " + student.age);
		}

	}
}

class Student implements Cloneable {

	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student getClone() {
		Student s = new Student(this.id, this.name, this.age);
		return s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
