package Test_Discuss;

public class Min_jumps_required {
	public static void main(String[] args) {
		int[] arr = {1,3,6,1,0,9,8,7,6};
		
		int[] dp = new int [arr.length];
		System.out.println(rec(arr, 0,dp));
	}

	public static int rec(int[] arr, int x,int[] dp) {
		if (x == arr.length-1) {
			return 0;
		}
		if (x >= arr.length) {
			return 2147480000;
		}
		int ans = 2147480000;
		if(dp[x]!=0) {
			return dp[x];
		}
		for (int i = 1; i <= arr[x]; i++) {
			int sp =rec(arr, x + i,dp);
			ans =  Math.min(ans, sp);
		}
		dp[x] = ans+1;
		return ans+1;
	}
}
