
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Create array with number inside
			int num[] = {1, 2, 3, 4};
			// print what is in the 5th position
		    System.out.println(num[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// print the exception
	        System.out.println("Exception thrown  :" + e);
	        // print the reason for the exception
	        System.out.println("Out of the block");
	    }
		
	}

}
