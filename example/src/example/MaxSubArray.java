package example;

public class MaxSubArray {
	static int maxSubArrayXOR(int arr[], int n) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int curr_xor = 0;
			for(int j=i; j<n; j++) {
				curr_xor = curr_xor^arr[j];
				ans = Math.max(ans, curr_xor);
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int a[] = {8, 1, 2, 12, 3};
		int n = a.length;
		System.out.println("Max SubArray XOR is : "+maxSubArrayXOR(a, n));
	}
}
