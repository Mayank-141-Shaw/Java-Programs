package example;

public class MathFunc {
	public int fact(int n)
	{
		if(n==0) return 1;
		else return n*fact(n-1);
	}
	public int Permutation(int n,int r)
	{
		int npr=fact(n)/fact(n-r);
		return npr;
	}
	public int Combination(int n,int r)
	{
		int ncr=Permutation(n,r)/fact(r);
		return ncr;
	}
	public int Sum(int a,int b)
	{
		return a+b;
	}
	public int Minus(int a,int b)
	{
		return a-b;
	}
	public int Product(int a,int b)
	{
		return a*b;
	}
	public float Divide(int a,int b)
	{
		return a/b;
	}
	public float Exp(int a,int b)
	{
		float s=1;
		for(int i=1;i<=b;i++)
			s*=a;
		return s;
	}
	public float Trignometry(float a,int ch)
	{
		float rad=(a*180)/(2*22/7);
		switch(ch)
		{
		case 1: return (float)Math.sin(rad);
		case 2: return (float)Math.cos(rad);
		case 3: return (float)Math.tan(rad);
		}
		return (float)0;
	}
	public float Hyperbolic(float a,int ch)
	{
		float rad=(a*180)/(2*22/7);
		switch(ch)
		{
		case 1: return (float)Math.sinh(rad);
		case 2: return (float)Math.cosh(rad);
		case 3: return (float)Math.tanh(rad);
		}
		return (float)0;
	}
}
