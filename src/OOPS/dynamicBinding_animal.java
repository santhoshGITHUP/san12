 package OOPS;

import java.util.Scanner;

public class dynamicBinding_animal {
  public static void main(String[] args) {
	  animal a = new animal();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter thr animal name..");
	System.out.println("1.dog 2.cat 3. cow");
	int choise = scan.nextInt();
	switch(choise) {
	case 1:{                                      
    a = new dog();  //dog d = new dog  //d=a
   a.eat();
  a.lifespan();
   
	break;
	}
	case 2: {               //cat c = new cat  //c=a
		 a = new cat();
		a.eat();
		a.lifespan();
	}
	case 3: {             //cow c1 = new cow  //c1=a
		 a= new cow();
		a.eat();
		a.lifespan();
	}
	}
	 // a.lifespan();
}
}
class animal {   // blue print
	public void eat() {
		
	}
	public void lifespan() {
		
	}
}

  class dog extends animal {
	  public void eat() {
		System.out.println("eats biscuits..");  
	  }
	  public void lifespan() {
			System.out.println("lives in 12 years");
		}
  }
  class cat extends animal {
	  public void eat()  {
		  System.out.println("Eats milk/fish");
	  }
	  public void lifespan() {
			System.out.println("lives in 8 years");
		}
  }
  class cow extends animal {
	  public void eat()  {
		  System.out.println("Eats grass");
	  }public void lifespan() {
			System.out.println("lives in 5 years");
		}
	  
  }