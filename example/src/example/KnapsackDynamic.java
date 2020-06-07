package example;
import java.util.*;
public class KnapsackDynamic {
	public static void main(String args[]) {
		int w[]=new int[10], p[]=new int[10], i, n, m;
		Scanner in=new Scanner(System.in);
		System.out.println("***Dynamic Programming***");
		System.out.println("Enter no. of items");
		n=in.nextInt();
		System.out.println("***Weights***");
		for(i=1;i<=n;i++) {
			System.out.println("Enter weight of item "+(i+1));
			w[i] = in.nextInt();
		}
		System.out.println("***Profits***");
		for(i=1;i<=n;i++) {
			System.out.println("Enter profit of item "+(i+1));
			p[i] = in.nextInt();
		}
		System.out.println("Enter knapsack capacity");
		m = in.nextInt();
		knapsack(w, p, m, n);
	}
	static void knapsack(int w[], int p[], int m, int n) {
		int v[][] = new int[10][10];
		int x[] = new int[10];
		int i, j;
		for(i=0;i<=n;i++) {
			for(j=0;j<=m;j++) {
				if(i==0 || j==0)
					v[i][j] = 0;
				else if(w[i]>j)
					v[i][j] = v[i-1][j];
				else
					v[i][j] = max(v[i-1][j], v[i-1][j-w[i]]+p[i]);
			}
		}
		System.out.println("Knapsack Solution:");
		for(i=0;i<=n;i++) {
			for(j=0;j<=m;j++)
				System.out.print(v[i][j]+"\t");
			System.out.println();
		}
		System.out.println("Maximum profit = "+v[n][m]);
		i=n;
		j=m;
		while(i!=0 && j!=0) {
			if(v[i][j] != v[i-1][j]) {
				x[i] = 1;
				j = j-w[i];
			}
			i--;
		}
		System.out.println("Selected Items are:");
		for(i=1;i<=n;i++) {
			if(x[i]==1)
				System.out.print(i+" ");
		}
	}
	static int max(int x, int y) {
		return x>y?x:y;
	}
}
