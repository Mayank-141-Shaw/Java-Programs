package example;
import java.math.*;
public class Check {
	int PrimeCheck(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
			if(a%i==0)
				count++;
		if(count==2)
			return 1;
		else
			return 0;
	}
	int CompositeCheck(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
			if(a%i==0)
				count++;
		if(count>2)
			return 1;
		else
			return 0;
	}
	int Palindrome(int a)
	{
		int dig,rev=0,n=a;
		while(n>0)
		{
			dig=n%10;
			rev*=10+dig;
			n/=10;
		}
		if(rev==a)
			return 1;
		else
			return 0;
	}
	int Armstrong(int a)
	{
		int dig,n=a,sum=0;
		while(n>0)
		{
			dig=n%10;
			sum=sum+(int)Math.pow(dig, 3);
			n=n/10;
		}
		if(sum==a)
			return 1;
		else
			return 0;
	}
}
