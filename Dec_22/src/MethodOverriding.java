
class Main {

	public void show()
	{
		System.out.println("Animal show");
	}
}	

//inherited class
class Child extends Main{
	@Override
	public void show()
	{
		System.out.println("Animal child show");
	}
}

// Driver Class
public class MethodOverriding{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a feature that allows a subclass or child class
		// to provide a specific implementation of a method
		// that is already used in super/parent class
		
		// MethodOverriding is referencing to parent object,
		// then parent show() method is called
		Main obj1 = new Main(); //parent class
		Child obj2 = new Child(); // child class
		
		obj1.show();
		// If the MethodOverriding referencing to child objects
		// show() is called. THis is during run time
		// of Polymorphism 
		obj2.show();
		
		
	}
}