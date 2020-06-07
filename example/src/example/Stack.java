package example;
import java.util.Scanner;
public class Stack
{
	private static final int max=5;
	int s[]=new int[max];
	int top=-1;
	public void push(int item)
	{
		if(top==max-1)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			s[top]=item;
			System.out.println("Element "+item+" is pushed into stack");
		}
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack Underflow");
		else
		{
			System.out.println("Popped element is = "+s[top--]);
		}
	}
	public void display()
	{
		if(top==-1)
			System.out.println("stack empty");
		else
		{
			System.out.println("Stack elements are: ");
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack sd=new Stack();
		while(true)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\nEnter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter item to insert");
					int item=sc.nextInt();
					sd.push(item);
					break;
			case 2: sd.pop();
					break;
			case 3: sd.display();
					break;
			default:System.out.println("Wrong choice");
			}
		}
	}
}