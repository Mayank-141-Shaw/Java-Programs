package example;
import java.util.Scanner;
public class progknap {
	public static void main(String args[]) {
	int n,i,m;
	int p[]=new int[10];
	int w[]=new int[10];
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of items");
	n=in.nextInt();
	System.out.println("******WEIGHTS******");
	for(i=1;i<=n;i++) {
		System.out.println("Enter the weight of  the item "+i);
		w[i]=in.nextInt();
	}
	System.out.println("******PROFITS******");
	for(i=1;i<=n;i++) {
		System.out.println("Enter the profit of the item "+i);
		p[i]=in.nextInt();
	}
	System.out.println("Enter the knapsack capacity");
	m=in.nextInt();
	knapsack(p,w,m,n);
}
static void knapsack(int p[],int w[], int m, int n) {
	int i,j;
	int v[][]=new int[10][10];
	int x[]=new int[10];
	for(i=0;i<=n;i++) {
		for(j=0;j<=m;j++) {
			if(i==0||j==0)
				v[i][j]=0;
			else if((j-w[i])<0)
				v[i][j]=v[i-1][j];
			else
				v[i][j]=max(v[i-1][j], p[i]+v[i-1][j-w[i]]);
		}
	}
	System.out.println("Knappsack solution");
	for(i=0;i<=n;i++) {
		for(j=0;j<=m;j++) {
			System.out.print(v[i][j]+"\t");
		}
		System.out.print("\n");
	}
	System.out.println("The maximum profit is "+v[n][m]);
	i=n;
	j=m;
	while(i!=0 && j!=0) {
		if(v[i][j]!=v[i-1][j]) {
			x[i]=1;
			j=j-w[i];
		}
		i=i-1;
	}
	System.out.println("Selected items are: ");
	for(i=1;i<=n;i++) {
		if(x[i]==1)
			System.out.print(i+" ");
	}
}
static int max(int x, int y) {
	if(x<y)
		return x;
	else
		return y;
}
}
