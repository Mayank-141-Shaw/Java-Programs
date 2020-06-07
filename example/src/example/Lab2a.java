package example;

public class Lab2a {
	public static void main(String args[])
	{
		Staff staff[]=new Staff[3];
		staff[0] = new Teaching(1,"Narend","271172",90000,"cse",3);
		staff[1] = new Technical(2,"Ara","271173",20000,"admin");
		staff[2] = new Contract(3,"Rahul","271174",90000,3);
		System.out.println("StaffID\tName\tPhone\tSalary\tDomain\tPublication\tSkill\tPeriod");
		for(int i=0;i<3;i++)
		{
			staff[i].Display();
			System.out.println();
		}
	}
}
