package example;
import java.util.*;
import java.io.*;
public class sameValueIndex {
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);
		String A, B;
		int flag=0;
		System.out.println("Enter two strings");
		A = sc.next();
		B = sc.next();
		char[] a1 = A.toCharArray();
		char[] a2 = B.toCharArray();
		if(a2.length < a1.length) {
			char[] temp = a1;
			a1 = a2;
			a2 = temp;
		}
		for( int i = 0; i<a1.length; i++) {
			if(a1[i] == a2[i]) {
				flag=1;
				System.out.println("Position : "+i+" , Value : "+a1[i]);
			}
		}
		if(flag==0) {
			System.out.println("No such common value");
		}
	}
}
