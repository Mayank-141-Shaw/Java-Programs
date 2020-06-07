package example;
import java.util.*;
public class prog4
{
	public static void main(String args[])
	{
		int a[]=new int[100000];
		int n,i;
		double end,start;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		n=in.nextInt();
		Random rand=new Random();
		for(i=0;i<n;i++)
			a[i]=rand.nextInt(100);
		a[n]=999;
		System.out.println("Elements to be sorted");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		//sorting
		start=System.nanoTime();
		quicksort(a,0,n-1);
		end=System.nanoTime();
		System.out.println("\nSorted elements are:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nTotal time taken =" +(end-start)+"ns");
	}
	static void quicksort(int a[],int l,int r)
	{
		int s;
		if(l<r)
		{
			s=partition(a,l,r);
			quicksort(a,l,s-1);
			quicksort(a,s+1,r);
		}
	}
	static int partition(int a[],int l,int r)
	{
		int p,i,j;
		i=l+1;
		j=r;
		p=a[l];
		while(i<=j)
		{
			while(a[i]<=p) i++;
			while(a[j]>p) j--;
			if(i<j)
			{
				swap(a,i,j);
			}
		}
		swap(a,l,j);
		return j;
	}
	static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}