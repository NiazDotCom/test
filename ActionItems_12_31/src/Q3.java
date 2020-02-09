import java.util.ArrayList;


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arraylist is a built in Java function
		ArrayList myArr = new ArrayList();
		// add is a built in method
		myArr.add("Apples");	// index = 0
		myArr.add(1);			// 1
		myArr.add(0.33);		// 2
		myArr.add("Red");		// 3
		myArr.add("Juicy");		// 4
		
		for(Object obj : myArr)
		{
			System.out.println(obj);
		}
		
		System.out.println(myArr);
		
	}

}
