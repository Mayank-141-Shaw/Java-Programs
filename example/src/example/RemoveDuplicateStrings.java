package example;
import java.util.*;
class RemoveDuplicateStrings{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int length=str.length();
		int index=0,count;
		char[] arr=str.toCharArray();
		//checking for duplicates
		char[] copy=new char[length]; 
		for(int i=0; i<length; i++) {
			count=0;
			for(int j=0;j<index; j++) {
				if(arr[i] != copy[j])
					count++;
			}
			if(count==index)
				copy[index++]=arr[i];
		}
		String.valueOf(copy);
		System.out.println(copy);
	}
}