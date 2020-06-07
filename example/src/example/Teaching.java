package example;

public class Teaching extends Staff{
	private String DOMAIN;
	private int PUBLICATIONS;
	public Teaching(int staffId, String name, String phone, long salary, String domain, int publications)
	{
		super(staffId, name, phone, salary);
		DOMAIN = domain;
		PUBLICATIONS = publications;
	}
	public void Display()
	{
		super.Display();
		System.out.print("\t"+DOMAIN+"\t"+PUBLICATIONS+"\t\t"+"--"+"\t"+"--");
	}
}
