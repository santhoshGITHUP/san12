package OOPS_inheritance;

public class same_address {
  public static void main(String[] args) {
	  Student s = new Student();
	  employee e= new employee();
	 }
}
     class Address {
    	 String bulidName;
    	 String streetName;
    	 String city;
		public String doorno;
		public String street;
		public String state;
		public String pincde;
    	 
     }
       class person  {
    	   String name;
    	   int age;
    	   int dob;
    	   Address address;
    	   public void displayaddress() {
    		   System.out.println(address.doorno +","+address.street+","+address.city+","+address.state+","+address.pincde);
    	   }
       }
       class employee extends Address {
    	   public void  Address(String doorno,String street,String city, String state, int pincode) {
    		   this.doorno = doorno;
    		   this.street = street;
    		   this.city = city;
    		   this.state = state;
    		   
    	   }
    	   String doorno; 
    		String street; 
    		String city; 
    		String state;
    		int pincode; 
		}
       class Student extends Address{
    		String std; 
    		int rollno; 
    		int rank; 
    		
    	}