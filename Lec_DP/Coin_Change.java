package Lec_DP;

import java.util.Scanner;

public class Coin_Change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(rec(arr, 0, n, ""));
		int[][] dp = new int[m][n+1];
		System.out.println(rec(arr,0,n,"",dp));
	
	}

	public static int rec(int[] arr, int idx, int amount, String str) {
		if (amount == 0) {
			System.out.println(str);
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		int ans = 0;
		for (int i = idx; i < arr.length; i++) {
			ans = ans + rec(arr, i, amount - arr[i], str + " " + arr[i]);
		}
		return ans;
	}

	public static int rec(int[] arr, int idx, int amount, String str, int[][] dp) {
		if (amount == 0) {
//			System.out.println(str);
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (dp[idx][amount] != 0) {
			return dp[idx][amount];
		}
		int ans = 0;
		for (int i = idx; i < arr.length; i++) {
			ans = ans + rec(arr, i, amount - arr[i], str + " " + arr[i], dp);
		}
		dp[idx][amount] = ans;
		return ans;
	}
}
