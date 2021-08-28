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
//		System.out.println(rec(arr, 0, n, ""));
//		int[][] dp = new int[m][n + 1];
//		System.out.println(rec(arr, 0, n, "", dp));
		System.out.println(BU2(arr,n));
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

	public static int BU(int[] arr, int amount) {
		int[][] dp = new int[arr.length][amount + 1];
		for (int c = arr.length - 1; c >= 0; c--) {
			for (int a = 0; a <= amount; a++) {
//				What are you creating here?!?!?! dp[c][a]!!
				if (a == 0) {
					dp[c][a] = 1;
					continue;
				}
				int ans = 0;
				for (int i = c; i < arr.length; i++) {
					if (a - arr[i] >= 0) {
						ans = ans + dp[i][a - arr[i]];
					}
				}
				dp[c][a] = ans;
			}
		}
		return dp[0][amount];
	}
	
	
	public static int rec_C(int[] arr, int amount , int idx,int[][] dp) {
//		Base casE?!!?!??!
		if(amount==0) {
			return 1;
		}
		if(idx==arr.length||amount<0) {
			return 0;
		}
		if(dp[idx][amount]!=0) {
			return dp[idx][amount];
		}
		int sp1 = rec_C(arr, amount-arr[idx], idx,dp);
		int sp2 = rec_C(arr, amount, idx+1,dp);
		dp[idx][amount] = sp1+sp2;
		return sp1+sp2;
	}
	
	
	public static int BU2(int[] arr, int amount) {
		int[][] dp = new int[arr.length+1][amount + 1];
		for (int c = arr.length - 1; c >= 0; c--) {
			for (int a = 0; a <= amount; a++) {
//				What are you creating here?!?!?! dp[c][a]!!
				if (a == 0) {
					dp[c][a] = 1;
					continue;
				}
				int sp1 = 0;
				if(a-arr[c]>=0) {
					sp1 = dp[c][a-arr[c]]; //rec_C(arr, a-arr[c], c,dp);
				}
				int sp2=0;
				if(c+1<arr.length) {
					sp2= dp[c+1][a];     //rec_C(arr, a, c+1,dp);
				}
				dp[c][a] = sp1+sp2;
			}
		}
		return dp[0][amount];
	}
	
}
