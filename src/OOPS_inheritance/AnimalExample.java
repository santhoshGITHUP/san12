package OOPS_inheritance;

public class AnimalExample {

	public static void main(String[] args) {
  Puppy a = new Puppy();
	a.walk();
	a.sleep();
	a.eat();
	a.play();   
//     
	}
}

class Animal {
	 public void walk() {
		 System.out.println("walk");
	}

	public void sleep() {
		System.out.println("sleep");
	}

	public void eat() {
		System.out.println("eat");
		
	}
	
}

class Dog extends Animal {

	public void bark() {
		System.out.println("bark");
      
	}

}

class Puppy extends Dog {
	 public void play() {
System.out.println("pubby");
	}
}

class Cat extends Animal {
	void jumps() {
		System.out.println("mewwwwow");

	}
}
class Cow extends Animal{
	public void jum() {
		 System.out.println("cow");
		
	}
	
	
}
