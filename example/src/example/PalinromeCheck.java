package example;
import java.util.Scanner;
public class PalinromeCheck {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int dig=0,rev=0,n;
		System.out.println("Enter a number");
		int x=in.nextInt();
		//reversing
		n=x;
		while(n>0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(rev==x)
			System.out.println("palindrome = "+rev);
		else
			System.out.println("not a palindrome = "+rev);
	}
}
