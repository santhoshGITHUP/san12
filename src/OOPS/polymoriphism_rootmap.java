package OOPS;

import java.util.Scanner;

public class polymoriphism_rootmap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your travel moode");
		System.out.println("1.train, 2.bus");
		int choice = sc.nextInt();
		switch(choice)  {
		case 1: {
			train t1 = new train();
			t1.booktrain();
			t1.roots();
		   t1.time();
			t1.ticketfees();
			t1.facility();
			break;
		}
		case 2: {
			bus b1 = new bus();
			b1.bookbus();
			b1.roots();
			b1.time();
			b1.ticketfees();
			b1.facility();
			break;

		}
		}
						
		//train t1 = new train();
		//t1.booktrain();
		//t1.roots();
	   // t1.time();
		//t1.ticketfees();
		//t1.facility();
						
		//bus b1 = new bus();
		//b1.bookbus();
		//b1.roots();
		//b1.time();
		//b1.ticketfees();
		//b1.facility();

	}
}

class train {
	public void booktrain() {
		System.out.println("train ticket confirmed");
	}

	public void roots() {
		System.out.println("chennai, karaikal, cuddalore, nagpattinam");
	}

	public void time() {
		System.out.println("train time is 10:30PM");
	}

	public void ticketfees() {
		System.out.println("ticket fees is 450rup");
	}

	public void facility() {
		System.out.println("sleeper seat ava here");
	}
}
		class bus extends train {
			public void bookbus() {
				System.out.println("bus ticket confirmed");
			}
			

			public void roots() {
				System.out.println("chennai,  pandy, nagoor, nagapattinam");

			}

			public void ticketfees() {
				System.out.println("ticket fees is 300 rupp");

			}

			public void facility() {
				super.facility();
				System.out.println(" TV ava");
				System.out.println("water bottle provied");
			}
		}
	

