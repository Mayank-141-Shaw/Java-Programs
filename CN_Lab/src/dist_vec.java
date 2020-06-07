import java.util.*;
class dist_vec{
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
				int i=0,j=0,k=0,count=0,n;
				int[][] dist,dmat,via;
				System.out.println("eNTER NO OF NODES");
				n=sc.nextInt();
				dist=new int[n][n];
				dmat=new int[n][n];
				via=new int[n][n];
				System.out.println("Enter cost matrix");
				for(i=0;i<n;i++) {
					for(j=0;j<n;j++) {
						dmat[i][j]=sc.nextInt();
						dmat[i][i]=0;
						dist[i][j]=dmat[i][j];
						via[i][j]=j;
					}
				}
			do {
				count=0;
				for(i=0;i<n;i++) {
					for(j=0;j<n;j++) {
						for(k=0;k<n;k++) {
							if(dist[i][j]>dist[i][k]+dist[k][j]) {
								dist[i][j]=dist[i][k]+dist[k][j];
								via[i][j]=k;
								count++;
							}
						}
					}
				}
			}while(count!=0);
			for(i=0;i<n;i++) {
				System.out.println("State value for router "+i);
				for(j=0;j<n;j++) {
					System.out.println("To "+j+"-via- "+via[i][j]+" distance is "+dist[i][j]);
				}
			}
	}
}