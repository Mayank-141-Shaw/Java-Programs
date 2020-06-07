package example;
import java.util.*;
public class MergeSort{
	public static void main(String args[]) {
		int a[]=new int[100000];
		int i, n;
		double start, end;
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Enter the number of inputs");
		n = in.nextInt();
		for(i=0;i<n;i++)
			a[i]=rand.nextInt(5000);
		System.out.println("Before sorting");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		start=System.nanoTime();
		mergesort(a, n);
		end = System.nanoTime();
		System.out.println("After sorting");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nTime taken to sort is = "+(end-start)+"ns");
	}
	static void mergesort(int a[], int n) {
		if(n>1) {
			int m=n/2;
			int b[]=new int[m];
			int c[]=new int[n-m];
			copy(a,0,m,b,0,m);
			copy(a,m,n,c,0,n-m);
			mergesort(b,m);
			mergesort(c,n-m);
			merge(b,c,a,m,n-m);
		}
	}
	static void merge(int b[], int c[], int a[], int p, int q) {
		int i=0,j=0,k=0;
		while(i<p && j<q) {
			if(b[i]<=c[j]) {
				a[k]=b[i];
				i++;
			}
			else {
				a[k]=c[j];
				j++;
			}
			k++;
		}
		if(i==p) {
			copy(c,j,q,a,k,p+q);
		}
		else
			copy(b,i,p,a,k,p+q);
	}
	static void copy(int a[], int x, int y, int b[], int i, int j) {
		while(x<y) {
			b[i++]=a[x++];
		}
	}
}