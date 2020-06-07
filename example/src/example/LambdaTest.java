package example;
import java.util.ArrayList;
public class LambdaTest {
	public static void main(String args[]) {
		LambdaInterface lobj = (int x)->System.out.println(2*x);
		lobj.abstractFun(5);
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		arrL.forEach(n -> System.out.println(n));
		arrL.forEach(n -> {if(n%2 == 0) System.out.println(n);} );
	}
}
