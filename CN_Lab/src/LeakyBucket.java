import java.util.*;
import java.util.Random;
public class LeakyBucket {
	public static void main(String args[]) {
		int drop=0,mini,nsec,premain=0;
		int orate,bsize,i,packet[];
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		packet=new int[100];
		System.out.println("Enter the bucket size");
		bsize=in.nextInt();
		System.out.println("Enter the output rate");
		orate=in.nextInt();
		Random rand=new Random();
		System.out.println("ENter no. of seconds to simulate");
		nsec=in.nextInt();
		for(i=0;i<nsec;i++)
			packet[i]=((rand.nextInt(9)+1)*10);
		System.out.println("Second \\ Packet Received \\ Packet Sent \\ Packet left \\ Packet dropped");
		for(i=0;i<nsec;i++) {
			premain += packet[i];
			if(premain > bsize) {
				drop=premain-bsize;
				premain=bsize;
				System.out.print(i+1+" ");
				System.out.print(packet[i]+" ");
				mini=Math.min(premain, orate);
				System.out.print(mini+" ");
				premain=premain-mini;
				System.out.print(premain+" ");
				System.out.print(drop+" ");
				System.out.println();
				drop=0;
			}
		}
		while(premain != 0) {
			if(premain>bsize) {
				drop=premain*bsize;
				premain=bsize;
			}
			mini=Math.min(premain, orate);
			System.out.print(" "+premain+" "+mini);
			premain=premain-mini;
			System.out.println(" "+premain+" "+drop);
			drop=0;
		}
	}
}
