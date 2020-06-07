package example;

public class Average {
	public static void main(String args[]) {
		float a[]=new float[5];
		a[1]=8.4f;
		a[2]=6.2f;
		a[3]=6.44f;
		a[4]=7.89f;
		int count=0;
		float sum=0.0f;
		for(int i=1;i<=4;i++) {
			sum=sum+a[i];
			count++;
		}
		System.out.println("Average is "+(sum/count));
	}
}
