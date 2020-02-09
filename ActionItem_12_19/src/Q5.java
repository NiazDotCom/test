
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Action(1, 50,10));
		System.out.println(Action(5.235, 40.25));
		System.out.println(Action("Niaz","Patwary","Goes","Java","Selenium"));
	}
	
	public static int Action(int a, int b, int c)
	{
		return (a*b*c);
	}
	public static double Action(double a, double b) 
	{
		return (a-b);
	}
	public static String Action(String a, String b, String c, String d, String e) 
	{
		return (a+b+c+d+e);
	}
}
