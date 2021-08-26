package Lec_DP;

public class Climbing {
	public static void main(String[] args) {
		
	}
	public static int rec(int curr, int n) {
		if(curr==n) {
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		int sp1 = rec(curr+1,n);
		int sp2 = rec(curr+2,n);
		
		return sp1+sp2;
	}
	public static int rec(int curr, int n,int[]dp) {
		if(curr==n) {
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		
//		if(dp[curr]!=0) {
//			return dp[curr];
//		}
		
		int sp1 = rec(curr+1,n,dp);
		int sp2 = rec(curr+2,n,dp);
		
		dp[curr] = sp1+sp2; //Memorize!!
	
		return sp1+sp2;
	}
	
	public static int BU(int n) {
		int[] dp = new int[n+2];
//		Initialize!!
		dp[n]=1;
		
		for(int i=n-1;i>=0;i--) {
			dp[i] = dp[i+1]+dp[i+2];
		}
		return dp[0];
	}
	
}
