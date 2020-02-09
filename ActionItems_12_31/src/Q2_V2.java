
public class Q2_V2 {

	public void employeeIncome(String name, int employee_id,
	String Position, int salary )
	{
		if (salary >= 15000)
		{
			System.out.println(name+" earns $"+salary);
		}
		else
		{
			System.out.println(name + " does not make more than $15000.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q2_V2 obj = new Q2_V2();
		obj.employeeIncome("Niaz", 12345678, "QA Lead", 1000000);
		//obj.employeeIncome(name, employee_id, Position, salary);
	}

}
