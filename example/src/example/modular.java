package example;

public class modular {
	static double Modular(int x, int y, int p) {
		return Math.pow(x, y)%p;
	}
	
	public static void main(String args[]) {
		double ans = Modular(2, 3, 5);
		System.out.println("2^3%5 = "+ans);
		double a = Double.MAX_EXPONENT;
		System.out.println(a);
		char b = Character.MIN_VALUE;
		System.out.println(b);
	}
}