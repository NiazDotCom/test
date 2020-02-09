
public class Polymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// has the ability of an Object to take many
		// forms. It actually occurs when a parent class
		// refers to a child/sub class
		// child/sub class of a class can defined their own
		// unique behaviors and share functionality of the
		// parent class. there are 2 type of polymorphism
		// static and dynamic. Inheritance, Method
		// overloading, overriding comes into
		// polymorphism concept
		
		// inheritance
		// when child obtain characteristic from parent
		// class perform different action
		
		PolyBank bank_2 = new PolyBank_2();
		PolyBank bank_3 = new PolyBank_3();
		
		System.out.println(bank_2.interstrate());
		System.out.println(bank_3.interstrate());
		
	}

}
