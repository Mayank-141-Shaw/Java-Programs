package example;

class Tree234 {
	private Node234 root = new Node234();		//make root node
	public int find(double key) {
		Node234 curNode = root;
		int childNumber;
		while(true) {
			if((childNumber = curNode.findItem(key)) != -1)
				return childNumber; 							//found it
			else if(curNode.isLeaf())
				return -1; 			//cant find it
			else
				curNode = getNextChild(curNode, key);
		}
	}
	
	//Insert a dataitem
	public void insert(double dValue) {
		//Performs the split
		//in a top-down (root ---> leaf) fashion
		Node234 curNode = root;
		DataItem tempItem = new DataItem(dValue);
		
		while(true) {
			if(curNode.isFull()) { 				//ifnode is full
				split(curNode);					//split it
				curNode = curNode.getParent();  //back up
														//search once	
				curNode = getNextChild(curNode, dValue);
			}
			else if(curNode.isLeaf()) 		//if node is leaf
				break;						//go insert
			//node is not full, not a leaf; so go to lower level
			else
				curNode = getNextChild(curNode, dValue);
		}
		curNode.insertItem(tempItem);     //insert new dataItem
	}
	
	public void split(Node234 thisNode) { 		//split the Node
		//assumes node is full
		DataItem itemB, itemC;
		Node234 parent, child2, child3;
		int itemIndex;
		
		itemC = thisNode.removeItem(); 			//remove iems from this node
		itemB = thisNode.removeItem(); 			
		child2 = thisNode.disconnectChild(2); 		//remove children from this node
		child3 = thisNode.disconnectChild(3);
		
		Node234 newRight = new Node234(); 			//make new nOde
		
		if(thisNode == root) {						// if this is the root
			root = new Node234();  					//make new root
			parent = root; 							//root is our parent
			root.connectChild(0, thisNode); 		//connect to parent
		}
		else
			parent = thisNode.getParent(); 			//thiis node is not the root get parent
		
		//deal with parent
		itemIndex = parent.insertItem(itemB); 			//itemB to parent
		int n = parent.getNumItems();					//total items?
		
		for(int j=n-1; j>itemIndex; j--) {				//move parents connectinons
			Node234 temp = parent.disconnectChild(j); 	//one child to the right
			parent.connectChild(j+1, temp); 			
		}
		
		parent.connectChild(itemIndex+1 , newRight); 	//connect newRight to parent
		
		//deal eith newRight
		newRight.insertItem(itemC); 				//itemC to newRight
		newRight.connectChild(0, child2); 			//connect to 0 and 1
		newRight.connectChild(1, child3); 			//on newRight
	}
	
	//gets appropriate child of the node during search for value
	public Node234 getNextChild(Node234 theNode, double theValue) {
		//Should be able to do this w/o a loop, since we should know
		//index of correct child already
		
		int j;
		//assumes node is not empty, not full, not a leaf
		int numItems = theNode.getNumItems();
		for(j=0; j<numItems; j++) {						//for each item in node are we less?
			if( theValue < theNode.getItem(j).dData )
				return theNode.getChild(j); 			//return left child
		}
		return theNode.getChild(j); 					//we're greater so return right child
	}
	
	public void displayTree() {
		recDisplayTree(root, 0, 0);
	}
	
	private void recDisplayTree(Node234 thisNode, int level, int childNumber) {
		System.out.print("level="+level+" child="+childNumber+" ");
		thisNode.displayNode(); 						//display this node
		
		//call ourseelves for each child of this node
		int numItems = thisNode.getNumItems();
		for(int j=0; j<numItems+1; j++) {
			Node234 nextNode = thisNode.getChild(j);
			if(nextNode != null)
				recDisplayTree(nextNode, level+1, j);
			else
				return;
		}
	}
	//end class Tree 234
}
