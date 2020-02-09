import java.util.ArrayList;


public class DynamucArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arraylist is a built in Java function
		ArrayList myArr = new ArrayList();
		// add is a built in method
		myArr.add(12);			// index =0
		myArr.add("Selenuim");	// 1
		myArr.add(true);		// 2
		myArr.add(12.46);		// 3
		
		System.out.println(myArr);
		
		//System.out.println(myArr.get(2));
		
		myArr.remove(1);
		System.out.println(myArr);

		
		
	}

}
