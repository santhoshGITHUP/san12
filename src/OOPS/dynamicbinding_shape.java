package OOPS;

public class dynamicbinding_shape {
	public static void main(String[] args) {

		Shape ss=new Shape();
		ss.draw();
		
		Shape s = new Square();//down casting..
		s.draw();
		s.fillColor("red");
		s= new Triangle();
	    s.draw();		  		  
	}
}

class Shape {

	public void fillColor(String color) {
		System.out.println(color+" has been set..");
	}
	public void draw() {
           System.out.println("   * ");
           System.out.println(" *   * ");
           System.out.println("*  *  *"); 
           
           
	}
}

class Square extends Shape {
	public void draw() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class Triangle extends Shape {
	public void draw() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


