
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// is a process of specifying multiple methods
		// under a class. Allows different methods to
		// have same name but different signatures.
		// Ex: number of parameters, type of parameters,
		// method name, order of parameter.
		// Parameter: is a argument value that passed into
		// a function
		
		System.out.println(Add(1, 50));
		System.out.println(Add(5.235, 40.25));
		System.out.println(Add("Java","Selenium"));
	}		
		public static int Add(int a, int b)
		{
			return (a+b);
		}
		public static double Add(double a, double b) 
		{
			return (a+b);
		}
		public static String Add(String a, String b) 
		{
			return (a+b);
		}
		
		
		
		
	}
