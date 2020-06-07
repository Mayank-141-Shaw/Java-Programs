import java.io.*;
class crc_gen{
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] crc,rem,div,divisor,data;
		int tot_length, data_bits, divisor_bits;
		System.out.println("Enter the no of data bits");
		data_bits = Integer.parseInt(br.readLine());
		data = new int[data_bits];
		System.out.println("Enter the data bits");
		for(int i=0;i<data_bits; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		divisor_bits = 17;
		divisor = new int[]{1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1};
		tot_length = data_bits+divisor_bits-1;
		rem = new int[tot_length];
		crc = new int[tot_length];
		div = new int[tot_length];
		
		//CRC genereation
		for(int i=0; i<data.length; i++) {
			div[i] = data[i];
		}
		System.out.println("Dividend after appending are:");
		for(int i=0; i<div.length; i++) {
			System.out.print(div[i]);
		}
		System.out.println();
		for(int j=0; j<div.length; j++) {
			rem[j] = div[j];
		}
		rem = divide(divisor, rem);
		for(int i=0;i<div.length; i++) {
			crc[i] = (div[i]^rem[i]);
		}
		System.out.println("CRC code:");
		for(int i=0;i<crc.length; i++) {
			System.out.print(crc[i]);
		}
		System.out.println();
		
		//Error detection
		System.out.println("Enter crc code to check");
		for(int j=0;j<crc.length; j++) {
			rem[j]=crc[j];
		}
		rem = divide(divisor, rem);
		for(int i=0;i<rem.length;i++) {
			if(rem[i]!=0) {
				System.out.println("Error");
				break;
			}
			if(i==rem.length-1) {
				System.out.println("No error");
			}
		}
		System.out.println("Thank you");
	}
	static int[] divide(int[] divisor, int[] rem) {
		int cur=0;
		while(true) {
			for(int i=0;i<divisor.length; i++) {
				rem[cur+i] = rem[cur+i] ^ divisor[i];
			}
			while(rem[cur]==0 && cur!=rem.length-1)
				cur++;
			if((rem.length-cur)<divisor.length)
				break;
		}
		return rem;
	}
}