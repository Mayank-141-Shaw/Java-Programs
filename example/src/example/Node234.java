package example;

class Node234 {
	public static final int ORDER = 4;
	private int numItems;
	private Node234 parent;
	private Node234 childArray[]= new Node234[ORDER];
	private DataItem itemArray[] = new DataItem[ORDER-1];
	
	//connect child to this node
	public void connectChild(int childNum, Node234 child) {
		childArray[childNum] = child;
		if(child != null)
			child.parent = this;
	}
	
	//disconnect child from this node, return it
	public Node234 disconnectChild(int childNum) {
		Node234 tempNode = childArray[childNum];
		childArray[childNum] = null;
		return tempNode;
	}
	
	public Node234 getChild(int childNum) {
		return childArray[childNum];
	}
	
	public Node234 getParent() {
		return parent;
	}
	
	public boolean isLeaf() {
		return (childArray[0]==null) ? true:false;
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public DataItem getItem(int index) {  //get data item at index
		return itemArray[index];
	}
	
	public boolean isFull() {
		return (numItems==ORDER-1)? true:false;
	}
	
	public int findItem(double key) {    //return index of
		
		//should use binary search if ORDER is large
		//Could also return index of the pointer to chase
		//if the item is not found return -i, means key not found
		//but we need to follow childArray[i]
		//this would save looping in getnextChild
		
		for(int j=0; j<ORDER-1; j++) {           //item within node if found, otherwise return -1
			if(itemArray[j] == null)
				break;
			else if(itemArray[j].dData == key)
				return j;
		}
		return -1;
	}
	
	public int insertItem(DataItem newItem) {
		//Assumes node is not full
		numItems++;							//will add new item
		double newKey = newItem.dData;		//key of new item
		
		//Should start this loop at numItems-1, rather than ORDER -2
		
		for(int j=ORDER-2; j>=0; j--) {		//start on right , examine items if item is null,
			if(itemArray[j] == null)		//go left one cell
				continue;
			else {							//not null, get its key
				double itsKey = itemArray[j].dData;
				if(newKey < itsKey)			//if its bigger
					itemArray[j+1] = itemArray[j];		//shift it right
				else {
					itemArray[j+1] = newItem;   //insert new item
					return j+1;					//return index t o new item
				}
			}
		}
		itemArray[0] = newItem;
		return 0;
	}
	
	public DataItem removeItem() {		//remove largest item
		//assumes node not empty
		DataItem temp = itemArray[numItems-1];	//save item
		itemArray[numItems-1] = null; 			//disconnect it
		numItems--;
		return temp;
	}
	
	public void displayNode() { 			// format "/24/56/74"
		for(int j=0; j<numItems; j++)
			itemArray[j].displayItem(); 	//"/56"
		System.out.println("/");			//final "/"
	}
	
}
