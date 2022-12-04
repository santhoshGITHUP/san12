package EXCEPTION_HANDLING;

import java.util.Scanner;

public class THROWS_EX_voterID_apply {
    public static void main(String[] args) {
    	Customer c = createCustomer();
		try {
			applyVoterID(c);
		} catch (AgeUnderLimitException e) {
			e.printStackTrace();
		}
		doVote(c);

	}

	public static Customer createCustomer() {
		System.out.println("Enter customer name and age");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int age = scan.nextInt();
		return new Customer(name, age);
	}

	public static void applyVoterID(Customer c) throws AgeUnderLimitException {
		if (c.age < 18) {
			throw new AgeUnderLimitException();
		}
		System.out.println("Voter ID applying..");
		System.out.println("Verification process");
		System.out.println("Voter ID card dispatched..");
		c.setVoterIDAvail();

	}

	public static void doVote(Customer c) {
		c.voting();
	}
}

class Customer {
	String name;
	int age;
	boolean isVoterIDAvailable = false;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setVoterIDAvail() {
		isVoterIDAvailable = true;
	}

	public void voting() {
		if (isVoterIDAvailable) {
			System.out.println("Voting success..");
		}
	}

}

class AgeUnderLimitException extends Exception {
	public AgeUnderLimitException() {
		super("Age is under limit (18).");
	}
}
