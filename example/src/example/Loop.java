package example;
import java.io.*;
public class Loop {
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a range to run");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		//running the loop
		if(m>n)
		{
			int t=m;
			m=n;
			n=t;
		}
		for(int i=m;i<=n;i++)
			System.out.print(i+" ");
	}
}
