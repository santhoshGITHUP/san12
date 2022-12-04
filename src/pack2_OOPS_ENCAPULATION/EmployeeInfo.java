 package pack2_OOPS_ENCAPULATION;

import pack1_OOPS_ENCAPULATION.Employee;

public class EmployeeInfo {

	void displayEmp() {
		Employee e = new Employee();
		// System.out.println(e.id);
		System.out.println(e.name);
		// System.out.println(e.salary);
		// System.out.print(e.age);
	}
}

class SeniorEmp extends Employee {//sub of empl

	public void displayEmp() {
		//System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		//System.out.print(age);
	}
}
