
public class ArraySession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array: container that data/value single type
		// store multiple values in single variables
		// Limitation: Sizing & type of data issue (NOTE: if you
		// use dynamic array these limitation can be overcome
		
		// 1. Declare the array (int[] array)
		// 2. Initialize the array and set its size
		//    (array = new array[3])
		
		String [] names = new  String[4];
		
				names[0] = "Selenium";
				names[1] = "Java";
				names[2] = "Auto";
				names[3] = "12.56";
				
				System.out.println(names[0]);
				System.out.println(names[2]);
				
				for (int j = 0; j<names.length; j++)
				{
					System.out.println(names[j]);
				}
				
		int [] num1 = new int[4];
		
				num1[0] = 012;
				num1[1] = 345;
				num1[2] = 678;
				num1[3] = 901;
				
		for (int i = 0; i<=3; i++)
		{
			System.out.println(num1[i]);
		}

		int [] names1 = new  int[4];
		
		names1[0] = 123;
		names1[1] = 456;
		names1[2] = 789;
		names1[3] = 1256;
		
		//System.out.println(names1[2]);
		
		for (int str: names1)
		{
			System.out.println(str);
		}
		
		
		
		
		
		
		
	}

}
