package example;

public class ApplesandOranges {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		//s : start range of house
		//t : end range of house(inclusive)
		//a : point of apple tree
		//b : point of orange tree
		// apples ; list of apples falling with direction
		// oranges : list of oranges falling
		
		int countApple = 0, countOrange = 0;
		for(int i=0; i<apples.length; i++) {
			if (s<=apples[i]+a && apples[i]+a<=t)
				countApple++;
		}
		for(int i=0; i<oranges.length; i++) {
			if (s<=oranges[i]+b && oranges[i]+b<=t)
				countOrange++;
		}
		System.out.println(countApple);
		System.out.println(countOrange);
    }
	
	public static void main(String args[]) {
		int s=7, t=11, a=5, b=15;
		int[] apples = {-2, 2, 1};
		int[] oranges = {5, -6};
		countApplesAndOranges(s, t, a, b, apples, oranges );
	}
}
