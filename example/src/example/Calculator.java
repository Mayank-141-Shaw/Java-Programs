package example;
import java.util.*;
public class Calculator {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MathFunc cal=new MathFunc();
		int a,b;
		while(true)
		{
		System.out.println("Enter your choice");
		System.out.println("+.Add -.Subtract *. Product /.Divide ^.Power t.Trigno h.Hyperbolic f.Factorial p.Permutation c. Combination e.Exit");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+': System.out.println("Enter two numbers to add");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Sum = "+cal.Sum(a, b));
				break;
		case '-': System.out.println("Enter two numbers to subtract");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Difference = "+cal.Minus(a, b));
				break;
		case '*': System.out.println("Enter two numbers to Multiply");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Product = "+cal.Product(a, b));
				break;
		case '/': System.out.println("Enter two numbers to divide");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Division = "+cal.Divide(a, b));
				break;
		case '^': System.out.println("Enter a base and its power");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Power = "+cal.Exp(a, b));
				break;
		case 'd': System.out.println("Enter degree:");
				a=sc.nextInt();
				System.out.println("1.Sine 2.Cosine 3.Tangent");
				b=sc.nextInt();
				switch(b)
				{
				case 1: System.out.println("Sine value = "+cal.Trignometry((float)a, b));
						break;
				case 2: System.out.println("Cosine value = "+cal.Trignometry((float)a, b));
						break;
				case 3: System.out.println("Tangent value = "+cal.Trignometry((float)a, b));
						break;
				}
				break;
		case 'h': System.out.println("Enter degree:");
				a=sc.nextInt();
				System.out.println("1.SineH 2.CosineH 3.TangentH");
				b=sc.nextInt();
				switch(b)
				{
				case 1: System.out.println("Sine Hyper = "+cal.Hyperbolic((float)a, b));
						break;
				case 2: System.out.println("Cosine Hyper = "+cal.Hyperbolic((float)a, b));
						break;
				case 3: System.out.println("Tangent Hyper = "+cal.Hyperbolic((float)a, b));
						break;
				}
				break;
		case 'f': System.out.println("Enter number");
				a=sc.nextInt();
				System.out.println("Factorial = "+cal.fact(a));
				break;
		case 'p': System.out.println("Enter N and R values");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Permutation "+a+"P"+b+" = "+cal.Permutation(a, b));
				break;
		case 'c':System.out.println("Enter N and R values");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Combination "+a+"C"+b+" = "+cal.Combination(a, b));
				break;
		case 'e': System.out.println("You exited!");
				System.exit(0);
		}
		}
	}
}
