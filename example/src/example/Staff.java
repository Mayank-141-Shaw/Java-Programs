package example;

public class Staff {
	private int STAFFID;
	private String NAME, PHONE;
	private long SALARY;
	public Staff(int staffId, String name, String phone, long salary)
	{
		STAFFID = staffId;
		NAME = name;
		PHONE = phone;
		SALARY = salary;
	}
	public void Display()
	{
		System.out.print(STAFFID+"\t"+NAME+"\t"+PHONE+"\t"+SALARY);
	}
}
