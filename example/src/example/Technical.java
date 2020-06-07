package example;

public class Technical extends Staff{
	private String SKILLS;
	public Technical(int staffId, String name, String phone, long salary, String skills)
	{
		super(staffId, name, phone, salary);
		SKILLS = skills;
	}
	public void Display()
	{
		super.Display();
		System.out.print("\t--"+"\t"+"--"+"\t\t"+SKILLS+"\t"+"--");
	}
}
