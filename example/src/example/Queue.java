package example;

public class Queue {
	private static final int max = 10;
	int q[]=new int[max];
	int front,rear;
	Queue()
	{
		front = 0;
		rear = -1;
	}
	public void push(int item)
	{
		if(rear==max-1)
			System.out.println("Queue full");
		else
		{
			System.out.println("Enter value to push");
			q[++rear]=item;
		}
	}
	public int pop()
	{
		if(front>rear)
			System.out.println("Queue empty");
		else
		{
			return q[++front];
		}
		return 0;
	}
	public void display()
	{
		System.out.println("Contents of queue");
		for(int i=front;i<=rear;i++)
			System.out.print(q[i]+"  ");
	}
}
