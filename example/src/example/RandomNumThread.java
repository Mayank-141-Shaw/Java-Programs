package example;
import java.util.*;
public class RandomNumThread extends Thread{
		int a;
		public void run() {
			int i;
			Random rand=new Random();
			for(i=0;i<10;i++) {
				a=rand.nextInt(100);
				System.out.println("Random Number =" +a);
				Thread thread2=new Square_Num(a);
				thread2.start();
				Thread thread3=new Cube_Num(a);
				thread3.start();
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
