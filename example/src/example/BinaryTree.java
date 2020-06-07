package example;

public class BinaryTree {
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int s){
			data = s;
			left = null;
			right = null;
		}
	}
	
	public static BinaryTree search(BinaryTree tree, int x) {
		if(tree.root == null) {
			System.out.println("Element not present");
		}
		else if(tree.root.data == x && (tree.root.left == null && tree.root.left == null)){
			System.out.println("Element "+x+" found");
		}
		else {
			Node temp = tree.root;
			while(temp.left != null || temp.right != null) {
			if(temp.data == x) {
				System.out.println("Element "+x+" found");
			}
			else if(temp.data > x) {
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
			}
		}
		return tree;
	}
	
	public static BinaryTree insert(BinaryTree tree, int data) {
		
		return tree;
	}
}
