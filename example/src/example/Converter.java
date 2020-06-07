package example;

public class Converter {
	void Deci2AnyBase(int dec, int base)
	{
		String s=" ";
		char s1;
		while(dec>0)
		{
			int dig = dec%base;
			if(dig>9)
			{
				s1 = (char)(65-10+dig);
				s = s+s1;
			}
			dec = dec/base;
		}
		System.out.println("Converted term is: "+s);
	}
}
