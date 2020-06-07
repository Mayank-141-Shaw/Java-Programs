package example;
import java.util.Scanner;
public class lab3a {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b,c=0;
		System.out.println("Enter the value of a ");
		a=in.nextInt();
		System.out.println("Enter the value of b");
		b=in.nextInt();
		try
		{
			c=a/b;
			System.out.println("Result = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero");
		}
	}
}
