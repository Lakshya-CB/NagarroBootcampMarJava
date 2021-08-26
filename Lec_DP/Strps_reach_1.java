package Lec_DP;

public class Strps_reach_1 {
	public static void main(String[] args) {
		int n = 1000;
		int[]dp = new int[n+2];
		System.out.println(rec(n,dp));
	}

	public static int rec(int n) {
		if (n == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return rec(n / 2) + 1;
		} else {
			int sp1 = rec(n + 1);
			int sp2 = rec(n - 1);
			return Math.min(sp1, sp2) + 1;
		}
	}

	public static int rec(int n, int[] dp) {

		if (n == 1) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		if (n % 2 == 0) {
			int ans = rec(n / 2, dp) + 1;
			dp[n] = ans; // store! memorize!
			return ans;
		} else {
			int sp1 = rec(n + 1, dp);
			int sp2 = rec(n - 1, dp);
			
			dp[n] = Math.min(sp1, sp2) + 1; // store! memorize!
			
			return Math.min(sp1, sp2) + 1;
		}
	}
	public static int BU(int n) {
		int[] dp = new int[n+1];
		dp[1]=0; 
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				dp[i]= dp[i/2]+1;
			}
			else {
				dp[i] = 1+Math.min(dp[i-1], dp[(i+1)/2]+1);
			}
		}
		return dp[n];
	}
}
