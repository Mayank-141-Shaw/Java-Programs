package example;
import java.util.Scanner;
public class Student
{
	String USN,NAME,BRANCH,PHONE;
	public Student(String usn,String name,String branch,String phone)
	{
		USN=usn;
		NAME=name;
		BRANCH=branch;
		PHONE=phone;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n=sc.nextInt();
		Student st[]=new Student[n];
		String usn,name,branch,phone;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of student "+(i+1));
			System.out.print("USN:");
			usn=sc.next();
			System.out.print("NAME:");
			name=sc.next();
			System.out.print("BRANCH:");
			branch=sc.next();
			System.out.print("PHONE:");
			phone=sc.next();
			st[i]=new Student(usn,name,branch,phone);
		}
		System.out.println("Student details");
		System.out.println("USN\tNAME\tBRANCH\tPHONE");
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i].USN+"\t"+st[i].NAME+"\t"+st[i].BRANCH+"\t"+st[i].PHONE);
		}
	}
}