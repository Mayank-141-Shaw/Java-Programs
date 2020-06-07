package example;
import java.util.*;
public class TravellingSalesman {
	public static void main(String args[]) {
	int c[][]=new int[10][10];
	int tour[]=new int[10];
	int i, j, cost=0, n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the no. of cities");
	n = in.nextInt();
	if(n==1) {
		System.out.println("Path not possible");
		System.exit(0);
	}
	System.out.println("Enter the cost matrix");
	for(i=1; i<=n;i++)
		for(j=1; j<=n; j++)
			c[i][j] = in.nextInt();
	for(i=1; i<=n; i++)
		tour[i] = i;
	cost = tspdp(c, tour, 1, n);
	System.out.println("The accurate path is");
	for(i=1; i<=n; i++)
		System.out.print(tour[i]+"-->");
	System.out.println("1");
	System.out.println("The accurate mincost is "+cost);
	}
	static int tspdp(int c[][], int tour[], int start, int n) {
		int i, j, mintour[]=new int[10], ccost, mincost=999, temp[]=new int[10], k;
		
	}
}
