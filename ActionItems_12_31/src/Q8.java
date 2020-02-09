
public class Q8 {

	// Create a  class
	String CreditCardName;	// Create a class attribute
	int Number;
	String EXPDate;
	int security_code;  

	// Create a class constructor for the MyClass class
	public Q8() {
		CreditCardName = "Niaz";  // Set the initial value for the class attribute
		Number = 123456789;
		EXPDate = "01/21";
		security_code = 123;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q8 myObj = new Q8(); // Create an object of class MyClass (This will call the constructor)
	    System.out.println(myObj.CreditCardName); // Print the value of CreditCardName
	    System.out.println(myObj.Number);
	    System.out.println(myObj.EXPDate);
	    System.out.println(myObj.security_code);
	    
	}

}
