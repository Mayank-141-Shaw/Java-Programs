package example;

public class SeriesGenerator {
	void Fibonacci(int n)
	{
		int a=0,b=1,c;
		if(n<=0)
			System.out.println("No series");
		else if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a+" "+b);
		else
		{
			System.out.println(a+"\n"+b);
			for(int i=2;i<=n;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}
	void EvenGen(int n)
	{
		//Generate positive even numbers from 0 to n
		if(n<0)
			System.out.println("Enter a positive number");
		else
		{
			for(int i=0;i<=n;i++)
				System.out.print(i+" ");
		}
	}
	void EvenGen(int m,int n)
	{
		//Generate numbers from m till n
		if(m%2==0 && m<n)
		{
			for(int i=m;i<=n;i+=2)
				System.out.print(i+" ");
		}
		else if(m%2!=0 && m<n)
		{
			for(int i=m+1;i<=n;i++)
				System.out.print(i+" ");
		}
		else
			System.out.println("Enter valid parameters");
	}
}
