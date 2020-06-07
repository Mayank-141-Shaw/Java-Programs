package example;
import java.util.*;
public class Date {
	public void Date()
	{
		double date=System.currentTimeMillis();
		System.out.println("Current time ="+date+" ms");
	}
	public void Datem(int d,int m,int y)
	{
		System.out.println("Date : "+d);
		System.out.println("Month : "+m);
		System.out.println("Year : "+y);
		System.out.println(d+"/"+m+"/"+y);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Date ob=new Date();
		System.out.println("Enter date,month and year");
		int date=in.nextInt();
		int month=in.nextInt();
		int year=in.nextInt();
		ob.Date();
		ob.Datem(date,month,year);
	}
}
