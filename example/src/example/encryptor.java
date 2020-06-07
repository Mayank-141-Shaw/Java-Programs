package example;
import java.util.Scanner;
public class encryptor {
	static String encrypt(String text) {
		String result="";
		result=text.replace('a', 'm');
		result=result.replace('A', 'M');
		int length=result.length();
		result=result.substring(length/2) + result.substring(0, length/2);
		return result;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a text");
		String text=sc.nextLine();
		String result=encrypt(text);
		System.out.println("The encrypted text is: "+result);
	}
}
