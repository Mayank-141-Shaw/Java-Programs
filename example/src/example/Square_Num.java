package example;

public class Square_Num extends Thread{
	int n;
	public void run() {
		System.out.println("Square of number "+n+" is "+Math.pow(n, 2));
	}
	public Square_Num(int a) {
		n=a;
	}
}
