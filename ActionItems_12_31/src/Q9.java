import java.util.ArrayList;


public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arraylist is a built in Java function
		ArrayList myArr = new ArrayList();
		// add is a built in method
		myArr.add(10);			// index =0
		myArr.add("Selenuim");	// 1
		myArr.add(15);		// 2
		myArr.add("Java");		// 3
		
		System.out.println(myArr);
		
		//System.out.println(myArr.get(2));
		
		myArr.remove(0);
		myArr.remove(myArr.size()-1);
		System.out.println(myArr);
		}

}
