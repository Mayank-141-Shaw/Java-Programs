package example;
import java.util.*;
@SuppressWarnings("resource")
public class TernarySearch {
	static int Ternary(int a[], int n, int key) {
		
		//Returns position of the key
		
		int mid1,mid2,low=0,high=n-1;
		while(low<=high) {
			mid1=low+(high-low)/3;
			mid2=high-(high-low)/3;
			if(key==a[mid1])	//If key is at mid1
				return mid1;
			if(key==a[mid2])	//If key is at mid2
				return mid2;
			if(key<a[mid1])		//If key is in first block
				high=mid1-1;
			else if(key>a[mid2])	//If key is in third block
				low=mid2+1;
			else {
				low=mid1+1;		//If key is in second block
				high=mid2-1;
			}
		}
		if(low>high) //Returns -1 if not found
			return -1;
		return 0;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int n,i,temp;
		double end,start;
		System.out.println("Enter size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		//Entering values in the array
		for(i=0;i<n;i++) {
			a[i]=rand.nextInt(5000);
		}
		//sorting
		for(i=0;i<n-1;i++) {
			for(int j=i;j<n-i-1;j++) {
				if(a[j+1]<a[j]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("List to  search is: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}
		//To enter the number to search
		System.out.println("\nEnter number to search");
		int key=rand.nextInt();
		System.out.println("Number to search is "+key );
		start=System.nanoTime();
		int p=Ternary(a,n,key);
		if(p==-1) {
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Key found at position: "+p);
		}
		end=System.nanoTime();
		System.out.println("Total time taken = "+(end-start)+"nss");
	}
}
