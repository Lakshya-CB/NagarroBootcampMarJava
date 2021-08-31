package Lec_DP;

import java.util.Scanner;

public class Knapsac {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int S = scn.nextInt();
		int[] Cost = new int[S];
		int[] Wt = new int[S];
		for (int i = 0; i < S; i++) {
			Cost[i] = scn.nextInt();
		}
		for (int i = 0; i < S; i++) {
			Wt[i] = scn.nextInt();
		}
		int Cap = scn.nextInt();
			int[][] dp = new int[Cap + 1][Cost.length+1];
	//		BU
			for (int cap = 1; cap <= Cap; cap++) {
				for (int idx = Cost.length - 1; idx >= 0; idx--) {
	//				dp[cap][idx]
					int sp1 = 0;
					if (cap >= Wt[idx]) {
						sp1 = dp[cap - Wt[idx]][idx + 1] + Cost[idx];
					}
					int sp2 = dp[cap][idx + 1];
					dp[cap][idx] = Math.max(sp1, sp2);
				}
			}
			System.out.println(dp[Cap][0]);
	}

	public static int rec(int[] wt, int[] cost, int cap, int idx) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		int sp1 = 0;
		if (cap >= wt[idx]) {
			sp1 = rec(wt, cost, cap - wt[idx], idx + 1) + cost[idx];
		}
		int sp2 = rec(wt, cost, cap, idx + 1);

		return Math.max(sp1, sp2);

	}

	public static int rec(int[] wt, int[] cost, int cap, int idx, int[][] dp) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		if (dp[cap][idx] != 0) {
			return dp[cap][idx];
		}
		int sp1 = 0;
		if (cap >= wt[idx]) {
			sp1 = rec(wt, cost, cap - wt[idx], idx + 1, dp) + cost[idx];
		}
		int sp2 = rec(wt, cost, cap, idx + 1, dp);
		dp[cap][idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
}
