package example;
import java.util.Scanner;
public class runner {
	public static void main(String args[])
	{
		StringEncoder st=new StringEncoder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any text");
		String s=sc.nextLine();
		String snew="";
		snew=st.encode(s);
		System.out.println("Encoded text is : "+snew);
	}
}
