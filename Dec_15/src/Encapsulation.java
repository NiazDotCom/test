// Parent Class (Super Class)
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// is the process of Combining data and function
		// into a single unit class. THe data is not
		// accessed directly. It's accessed through the
		// function present inside the class
		
		selen obj = new selen();
		obj.setEmpName("Prosmart");
		obj.setEmpAge(23);
		obj.setEmpSSN(12345678);
		System.out.println("Employee Name"+" "+obj.getEmpName());
		System.out.println("Employee Age"+" "+obj.getEmpAge());
		System.out.println("Employee SSN"+" "+obj.getEmpSSN());
		
		
	}	
}

// child class / sub class (constructor)	
class selen{
	
	// is the process combining data and function into
	// a single unit class. The data is not accessed
	// directly. It's accessed through the function
	// present inside the class
	
		private int ssn;
		private String empName;
		private int empAge;
		
		// Get method
		public int getEmpSSN()
		{
			return ssn;
		}
		public String getEmpName()
		{
			return empName;
		}
		public int getEmpAge()
		{
			return empAge;
		}
		
		// Set method
		public void setEmpName(String newValue)
		{
			empName = newValue;
		}
		public void setEmpAge(int newValue)
		{
			empAge = newValue;
		}
		public void setEmpSSN(int newValue)
		{
			ssn = newValue;
		}
		
}
		
		
		
		