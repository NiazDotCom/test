
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap obj = new Encap();
		obj.setFirstName("Niaz");
		obj.setLastName("Patwary");
		obj.setCollegeName("CCNY");
		obj.setID(24412019);
		obj.setZip(11216);
		
		System.out.println("Student First Name: "+ obj.getFirstName());
		System.out.println("Student Last Name: "+ obj.getLastName());
		System.out.println("College Attended: "+ obj.getCollegeName());
		System.out.println("Student ID: "+ obj.getID());
		System.out.println("Student Zip Code: "+ obj.getZip());
	}
}
	
//sub class or the child class(Constructor)
class Encap{
	private String FirstName;
	private String LastName;		
	private String CollegeName;
	private int ID;
	private int Zip;
		
	//get methods
	public String getFirstName()
	{
		return FirstName;
	}

	public String getLastName()
	{
		return LastName;
	}

	public String getCollegeName()
	{
		return CollegeName;
	}

	public int getID()
	{
		return ID;
	}

	public int getZip()
	{
		return Zip;
	}
	
	//set methods
	public void setFirstName(String newValue)
	{
		FirstName = newValue;
	}

	public void setLastName(String newValue)
	{
		LastName = newValue;
	}

	public void setCollegeName(String newValue)
	{
		CollegeName = newValue;
	}

	public void setID(int newValue)
	{
		ID = newValue;
	}

	public void setZip(int newValue)
	{
		Zip = newValue;
	}
}