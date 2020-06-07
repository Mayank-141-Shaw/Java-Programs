package example;
import java.util.*;
public class Dijkstra {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n, src, i, j;
		int c[][]=new int[10][10];
		System.out.println("Enter the number of nodes");
		n = in.nextInt();
		System.out.println("Enter the cost matrix");
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				c[i][j] = in.nextInt();
			}
		}
		System.out.println("Enter the source node");
		src = in.nextInt();
		dijkstra(n, c, src);
	}
	static void dijkstra(int n, int c[][], int src) {
		int i, j, u=0, v=0, min, count;
		int visited[]= new int[10];
		int d[]=new int[10];
		for(i=1; i<=n; i++) {
			visited[i] = 0;
			d[i] = c[src][i];
		}
		count = 0;
		d[src] = 0;
		visited[src] = 1;
		count++;
		while(count != (n-1)) {
			min=999;
			for(i=1; i<=n; i++) {
				for(j=1; j<=n; j++) {
					if(d[i]<min) {
						min = d[i];
						u=i;
					}
				}
			}
			visited[u]=1;
			count++;
			for(v=1; v<=n; v++) {
				if(visited[v] == 0) {
					if(d[u]+c[u][v]<d[v]) {
						d[v] = d[u]+c[u][v];
					}
				}
			}
		}
		System.out.println("The shortest distance between: ");
		for(i=1; i<=n; i++) {
			System.out.println(src+"--->"+i+"="+d[i]);
		}
	}
}
