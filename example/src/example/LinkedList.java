package example;
import java.util.*;
public class LinkedList{
	Node head;
	
	//The inner class is made static so that main() can access it
	static class Node{
		int data;
		Node next;
		
		//Constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//Method to insert a new node
	public static LinkedList insert(LinkedList list,int data) {
		//Create new node with new data
		Node new_node = new Node(data);
		new_node.next = null;
		
		//If the list is empty then make the new node as head
		if(list.head == null)
			list.head = new_node;
		else {
			//Traverse till the last node and insert at the end
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			//Insert the new node at the last node
			last.next=new_node;
		}
		return list;
	}
	
	public static LinkedList insertFront(LinkedList list, int data) {
		//Create new node with new data
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null)
			list.head = new_node;
		else {
			new_node.next = list.head;
			list.head = new_node;
		}
		return list;
		
	}
	
	public static LinkedList deleteRear(LinkedList list) {
		if(list.head == null)
			System.out.println("Can't delete list empty");
		else if(list.head.next == null) {
			list.head = null;
			System.out.println("Do not delete anymore list is empty");
		}
		else {
			Node cur_node = list.head;
			while(cur_node.next.next != null) {
				cur_node = cur_node.next;
			}
			int show = cur_node.next.data;
			cur_node.next = null;
			System.out.println("Item deleted was "+show);
		}
		return list;
	}
	
	public static LinkedList deleteFront(LinkedList list) {
		if(list.head == null)
			System.out.println("List is empty");
		else {
			Node front = list.head;
			list.head = front.next;
			System.out.println("Item "+front.data+" was deleted");
		}
		return list;
	}
	
	public static void printList(LinkedList list) {
		
		Node curNode = list.head;
		System.out.println("The Linked list is: ");
		
		//Traverse through the list
		while(curNode != null) {
			//Print the current node
			System.out.print(curNode.data+" ");
			
			//Traverse the next node
			curNode=curNode.next;
		}
		System.out.println();
	}
	
	public static LinkedList reverseList(LinkedList list) {
		
		Node curNode = list.head;
		Node prevNode = null;
		Node nextNode = null;
		while(curNode != null) {
			nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
		list.head = prevNode;
		return list;
	}
	
	//Driver code
	public static void main(String args[]) {
		//Creating the list
		Random rand = new Random();
		LinkedList list=new LinkedList();
		
		//Inserting the values
		for(int i=1;i<=10;i++) {
			list = insert(list, rand.nextInt(400));
		}
		
		//Printing the list
		printList(list);
		deleteRear(list);
		printList(list);
		System.out.println("Item 627 will be inserted in front");
		insertFront(list, 627);
		printList(list);
		deleteFront(list);
		printList(list);
		System.out.println("Reversing the linked list");
		reverseList(list);  	//Reversing list
		printList(list);
	}
	
}