package ABSTRACTION;

public class AbstractionExample {

	public static void main(String[] args) {
       Dog a = new Dog();
       a.bark();
       Cat c = new Cat();
       c.eat();
       c.birth();
        Heart h = new Heart();
        h.getHeartratepermin();
        h.pumb();
       
	}
}
              /// USING INTERFACE...
  interface Heartlisener {
	  public abstract void pumb();
	   void getHeartratepermin();
  }
  class Heart implements  Heartlisener{

	@Override
	public void pumb() {
		System.out.println("heart pump rate is good...");
	}

	@Override
	public void getHeartratepermin() {
		System.out.println("heart rate is 72 per mins");
	}
	  
  }

abstract class Animal {
	public void birth() {              // normal/concreate method
		System.out.println("Born");
	}

	public void death() {
		System.out.println("Died");
	}

	public abstract void eat();  // abstract methods
}

class Dog extends Animal {
	public void bark() {
     System.out.println("dog is Braking...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub\\
		
	}
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Milk/fish.");
	}

}