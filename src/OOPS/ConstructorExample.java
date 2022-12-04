package OOPS;

public class ConstructorExample {

	public static void main(String[] args) {
		
		A a1=new A(34);
		a1.displayValue();
		
	}
}


class A{
	
	int value;
	
	public A(int value) {
		this.value = value;
	}

	public void displayValue() {
		System.out.println(value);
	}
}