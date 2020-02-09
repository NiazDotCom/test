
public class ChildClass extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass obj1 = new ChildClass();
		obj1.calcCarEMI();
		obj1.calcHomeEMI();
		obj1.offerService();
		obj1.calulateHOA();
		
	}

	public void calcHomeEMI()
	{
		System.out.println("your EMI is 50K");
	}
	
	public void calcCarEMI()
	{
		System.out.println("your EMI is 25K");
	}
	
	
}
