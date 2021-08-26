package Lec_DP;

public class Fib_ {
	public static void main(String[] args) {
		int n = 600000000;
//		System.out.println(rec(n));
		int[] dp = new int[n + 1];
//		System.out.println(rec_TD(n, dp));
		System.out.println(BU(n));
	}

//	T = O(2^n) S = O(n)  from n function frame, each ff having constant number of variables
	public static int rec(int n) {
		if (n < 2) {
			return n;
		}

		int sp1 = rec(n - 1);
		int sp2 = rec(n - 2);

		return sp1 + sp2;
	}

// T= O(n) and S = O(n)
	public static int rec_TD(int n, int[] dp) {
		if (n < 2) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int sp1 = rec_TD(n - 1, dp);
		int sp2 = rec_TD(n - 2, dp);

		dp[n] = sp1 + sp2; // memorization!!

		return sp1 + sp2;
	}

	public static int BU(int n) {
//		Size of your DP array!!
		int[] dp = new int[n + 1];
//		Initialize?!! 
		dp[0] = 0;
		dp[1] = 1;
//		Filling!! from 2 to n
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
