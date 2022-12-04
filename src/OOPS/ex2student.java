package OOPS;

import java.util.Scanner;

public class ex2student {
	String studentName;
	char gender;
	String department;
	int age;
	long roolnumber;
	int regnumber;
	long phonenumber;
	float studentheight;
	String fathername;
	String mothername;
	int mark;

	public ex2student(String studentName, int age, long roolnumber) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.roolnumber = roolnumber;
	}

	public void semmark1() {
		System.out.println("sem1 marks is 75%");
	}

	public void semmark2() {
		System.out.println("sem2 mark is 80%");
	}

	public void result() {

		if (mark < 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void studentdetails() {
		System.out.println("details....");
		System.out.println("student name   :" + studentName);
		System.out.println("gender         :" + gender);
		System.out.println("department     :" + department);
		System.out.println("age            :" + age);
		System.out.println("rool number    :" + roolnumber);
		System.out.println("reg number     :" + regnumber);
		System.out.println("phone number   :" + phonenumber);
		System.out.println("student height :" + studentheight);
		System.out.println("father name    :" + fathername);
		System.out.println("mother name    :" + mothername);
		System.out.println("mark is        :" + mark);

	}
}
