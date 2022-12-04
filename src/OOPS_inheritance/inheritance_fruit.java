package OOPS_inheritance;

public class inheritance_fruit {
  public static void main(String[] args) {
	  System.out.println("fruits");
		apple ff = new apple();
		ff.red();
		ff.seed();
}
}
class fruits{
	public void flushy_part() {
		System.out.println("YES");
		
	}
	public void seed() {
		System.out.println("YES");
	}
	void season() {
		System.out.println("sep to oct");
	}
	void normal() {
		
	}
	void colour() {
		
	}
	
}
class apple extends fruits{
	void red() {
		System.out.println("RED");
	}
}
class straburry extends fruits{
	void throns() {
		System.out.println("PRESENT");
	}
}
class bananna extends fruits{
	void skin() {
		System.out.println("Should be removed");
		
		
		
	}
}