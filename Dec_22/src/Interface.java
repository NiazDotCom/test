interface Persons 
{
	public void subject();
	public void studentName();
}	
	
public class Interface implements Persons {
	
	public void subject()
	{
		System.out.println("This is Math class");
	}
	
	public void studentName()
	{
		System.out.println("John");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// reference type in java which is similar to class
		// it will contain abstract methods. A class will be
		// implemented an interface
		
		// Skeletal:
		// interface person
		// public void Subject();
		// public void studentName();
		
		Interface e = new Interface();
		e.studentName();
		e.subject();
		
		
	}

}
