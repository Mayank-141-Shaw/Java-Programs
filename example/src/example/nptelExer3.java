package example;
import java.util.*;
public class nptelExer3 {
	public static void main(String args[]) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		x = sc.nextDouble();
		//to find perimeter
		System.out.println("Perimeter = "+(2*Math.PI*x));
		//to find area
		System.out.println("Area = "+(Math.PI*x*x));
	}
}
