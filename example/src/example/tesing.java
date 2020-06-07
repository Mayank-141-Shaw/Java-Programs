package example;
public class tesing {
	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=5-i+1;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=2;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
			}
}
