package example;

public class Overload {
		public static void main(String args[])
		{
			OverLoadDemo ob=new OverLoadDemo();
			double result;
			ob.test();
			ob.test(10);
			ob.test(10,20);
			result = ob.test(123.45);
			System.out.println("Result of ob.test(1233.45)= "+result);
		}
	}
