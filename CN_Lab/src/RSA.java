import java.math.*;
import java.util.*;
import java.io.*;
public class RSA {
	BigInteger p,q,N,phi,e,d;
	int bitlength=100;
	Random r;
	public RSA() {
		r=new Random();
		p=BigInteger.probablePrime(bitlength, r);
		q=BigInteger.probablePrime(bitlength, r);
		N=p.multiply(q);
		phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		e=BigInteger.probablePrime(bitlength/2, r);
		while(phi.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
			e.add(BigInteger.ONE);
		d=e.modInverse(phi);
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String args[])throws IOException{
		RSA rsa=new RSA();
		DataInputStream in=new DataInputStream(System.in);
		String teststring;
		System.out.println("Enter plain text");
		teststring=in.readLine();
		System.out.println("Encrypted string : "+teststring);
		System.out.println("String in bytes: "+bytesToString(teststring.getBytes()));
		byte[] encrypted = rsa.encrypt(teststring.getBytes());
		System.out.println("Encrypted string in bytes: "+bytesToString(encrypted));
		byte[] decrypted = rsa.decrypt(encrypted);
		System.out.println("Decrypted string in bytes: "+bytesToString(decrypted));
		System.out.println("Decryped string: ");
		System.out.println(new String(decrypted));
	}
	
	private static String bytesToString(byte[] encrypted) {
		String test = "";
		for(byte b: encrypted) {
			test+= Byte.toString(b);
		}
		return test;
	}
	
	private byte[] encrypt(byte[] message) {
		return (new BigInteger(message)).modPow(e, N).toByteArray();
	}
	
	private byte[] decrypt(byte[] message) {
		return (new BigInteger(message)).modPow(d, N).toByteArray();
	}
}
