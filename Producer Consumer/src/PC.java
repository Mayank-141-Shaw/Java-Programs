
public class PC {
	public static void main(String args[]) {
		Q q=new Q();
		Producer P=new Producer(q);
		Consumer C=new Consumer(q);
		
		//start threads
		P.t.start();
		C.t.start();
		
		System.out.println("Press Control-C to stop.");
	}
}
