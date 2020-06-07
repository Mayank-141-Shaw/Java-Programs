package example;
import java.util.*;
public class Listings {
	public static void main(String args[]) {
		List<String> happy = new ArrayList<String>();
		happy.add("Sam");
		happy.add("Fridge");
		happy.add("List");
		System.out.println(happy);
		happy.remove(1);
		System.out.println(happy);
		happy.add(1, "Jelly");
		System.out.println(happy);
		happy.add(2, "ChickenBurger");
	}
}
