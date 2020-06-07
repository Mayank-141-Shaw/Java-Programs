
public class Pagoda {
	private Pnode root;
	
	public Pagoda() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void makeEmpty() {
		root = null;
	}
	
	public void insert(int val) {
		Pnode newNode = new Pnode(val);
		root = insert(newNode, root);
		
	}
	
	private Pnode insert(Pnode newNode, Pnode pq) {
		newNode.left = newNode;
		newNode.right = newNode;
		return (merge(pq, newNode));
	}
	
	private Pnode merge(Pnode a, Pnode b) {
		Pnode bota, botb, r, temp;
		
		if(a==null)
			return b;
		else if(b==null)
			return a;
		else {
			bota = a.right;
			a.right = null;
			botb = b.left;
			b.left=null;
			r=null;
			
			while(bota != null && botb != null) {
				if(bota.data < botb.data) {
					temp=bota.right;
					if(r==null)
						bota.right=bota;
					else {
						bota.right=r.right;
						r.right=bota;
					}
					r = bota;
					bota = temp;
				}
				else {
					temp=botb.left;
					if(r==null)
						botb.left=botb;
					else {
						botb.left=r.left;
						r.left=botb;
					}
					r = botb;
					botb = temp;
				}
			}
			if(botb == null) {
				a.right=r.right;
				r.right=bota;
				return a;
			}
			else {
				b.left=r.left;
				r.left=botb;
				return b;
			}
		}
	}
	
	public void delete() {
		root = delete(root);
	}
	
	private Pnode delete(Pnode pq) {
		Pnode le, ri;
		
		if(pq == null) {
			System.out.println("Empty");
			return null;
		}
		else {
			if(pq.left == pq)
				le = null;
			else {
				le = pq.left;
				while(le.left != pq)
					le=le.left;
				le.left = pq.left;
			}
			if(pq.right == pq)
				ri=null;
			else {
				ri=pq.right;
				while(ri.right != pq)
					ri = ri.right;
				ri.right=pq.right;
			}
			return merge(le, ri);
		}
	}
	
	public void printPagodaRoot() {
		if(root != null)
			System.out.print(root.data +"\n");
		else
			System.out.print("Empty\n");
	}
}
