package example;
import java.util.*;
public class Prims {
	public static void main(String args[]) {
		int c[][] = new int[10][10];
		int i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the noo. of vertices");
		int n = in.nextInt();
		System.out.println("Enter the cost matrix");
		for(i=1; i<=n; i++)
			for(j=1; j<=n; j++)
				c[i][j] = in.nextInt();
		System.out.println("Minimum cost spanning tree edges and costs are");
		prims(c, n);
	}
	static void prims(int c[][], int n) {
		int ne=0, mincost=0, v=0, u=0, i, j, min;
		int visited[] = new int[10];
		for(i=1; i<=n;i++)
			visited[i] = 0;
		visited[1] = 1;
		while(ne != (n-1)) {
			min = 999;
			for(i=1; i<=n; i++) {
				for(j=1; j<=n; j++) {
					if(visited[i] == 1) {
						if(c[i][j] < min) {
							min = c[i][j];
							u=j;
							v=i;
						}
					}
				}
			}
			if(visited[u] == 0) {
				visited[u] = 1;
				ne++;
				mincost += min;
				System.out.println(u+"--->"+v+"="+min);
			}
			c[u][v] = c[v][u] = 999;
		}
		System.out.println("Mincost = "+mincost);
	}
}
