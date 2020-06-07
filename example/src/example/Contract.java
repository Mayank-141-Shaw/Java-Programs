package example;

public class Contract extends Staff {
	private int PERIOD;
	public Contract(int staffId, String name, String phone,long salary, int period)
	{
		super(staffId, name, phone, salary);
		PERIOD = period;
	}
	public void Display()
	{
		super.Display();
		System.out.print("\t--"+"\t"+"--"+"\t\t"+"--"+"\t"+PERIOD);
	}
}
