package OOPS_inheritance;

public class InheritanceExample {

	public static void main(String[] args) {

		
		 B1 b=new B1();
		 b.show();
		 b.display();
	}
}

class A {

	void display() {
		System.out.println("displaying..");
	}
}

class B extends A{
    void show() {
    	System.out.println("Showing..");
    }
}

class B1 extends B {
	
}

class C extends A{
	void print() {
		System.out.println("Printing..");
	}
}
