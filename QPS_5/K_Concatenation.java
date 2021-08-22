package QPS_5;

public class K_Concatenation {
	public static void main(String[] args) {
		int[] arr = { 1,-1};
		int k = 1;
		kConcatenationMaxSum(arr, k);
	}

	public static int kConcatenationMaxSum(int[] arr, int k) {
//		Max Basic Sum in 1 array
		long sum = 0;
		long max_sum = 0;
		long total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			sum = Math.max(sum, 0);
			max_sum = Math.max(max_sum, sum);

			total_sum = total_sum + arr[i];
		}
		long C1 = max_sum;
		
		if (k == 1) {
			return (int)(C1%1000000007);
		}

//		k>1

//		Boundary case!! considering 2 array!!
//		from end to 0 sum right to left
		long sumR = 0;
		long maxR_sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sumR = sumR + arr[i];
			// sumR= Math.max(sumR, 0); start fresh?!!?!

			maxR_sum = Math.max(maxR_sum, sumR);
		}

//		from 0 to end left to right;
		long sumL = 0;
		long maxL_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sumL = sumL + arr[i];
			// sumR= Math.max(sumR, 0); start fresh?!!?!
			maxL_sum = Math.max(maxL_sum, sumL);
		}

//		Boundary answer
		long C2 = maxL_sum + maxR_sum;

//		Add k-2*total sum in C2
		long C3 = C2 + (k - 2) * total_sum;
		System.out.println(C1+ " , "+ C2 + " , " +C3);
		long ans = Math.max(C1, Math.max(C2, C3));
		return (int)(ans%1000000007);
	}
}
