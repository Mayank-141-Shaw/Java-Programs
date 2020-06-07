package example;

public class Cube_Num extends Thread{
	int n;
	public void run() {
		System.out.println("Cube of a number "+n+" is "+Math.pow(n, 3));
	}
	public Cube_Num(int a) {
		n=a;
	}
}
