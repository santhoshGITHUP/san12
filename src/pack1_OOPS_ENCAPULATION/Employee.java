package pack1_OOPS_ENCAPULATION;
    
public class Employee {
	  // acess modifier.....
	int id=12;   //default    // with in package only
	public String name="san";   //  anywhere
	protected float salary=1200;   // outside of package on sub class only not in main class
	private int age=30;    // with in class only

	public void displayEmp(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);
	}
}
