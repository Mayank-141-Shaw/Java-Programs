package example;
import java.util.*;
public class ternaryOperator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any 4 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("Greatest of them is "+great(a, b, c, d));
	}
	
	static int great(int a, int b, int c, int d) {
		return (a>b)?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
	}
}
