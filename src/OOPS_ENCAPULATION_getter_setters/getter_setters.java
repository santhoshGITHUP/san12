package OOPS_ENCAPULATION_getter_setters;

public class getter_setters {
   public static void main(String[] args) {
	  employee e = new employee();
	 // e.setEmpID(123);     /// only read dont write condition
	  System.out.println(e.getEmpID());
	  System.out.println(e.getDesignation());
	  System.out.println(e.getSalary());
	 e.setPhone("99090900");
	 String phone = e.getPhone();
	 System.out.println();
}
}
  class employee {
	  private int empID=123;;
	  public int getEmpID() {
		return empID;
	}
	private void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	private void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getSalary() {
		return salary;
	}
	private void setSalary(float salary) {
		this.salary = salary;
	}
	private String name;
	  private String designation="sse";
	  private String phone;
	  private float salary=12000f;
  }