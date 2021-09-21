package QPS_extra;

import java.util.Scanner;

public class Optimal_game {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(BU(arr));
	}
	public static int rec(int[] arr, int start, int end) {
		if(start+1==end) {
			return Math.max(arr[start], arr[end]);
		}
//		int sp1 = arr[start]+ rec(arr,start+2,end);
//		int sp2 = arr[start]+ rec(arr,start+1,end-1);
		int sp01 = arr[start]+Math.min(rec(arr,start+2,end),rec(arr,start+1,end-1));
		
//		int sp3 = arr[end]+ rec(arr,start,end-2);
//		int sp4 = arr[end]+ rec(arr,start+1,end-1);
		
		int sp02 = arr[end]+Math.min(rec(arr,start,end-2),rec(arr,start+1,end-1));
		
		return Math.max(sp01, sp02);
//		return Math.max(Math.max(sp1, sp2),Math.max(sp2,sp3));
		
	}
	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];
		for(int start = arr.length-1;start>=0;start--) {
			for(int end = 0;end<arr.length;end++) {
				if(start+1>end) {
//					System.out.println(start+" - " +end );
					continue;
				}
				
				if(start+1==end) {
					dp[start][end] =Math.max(arr[start], arr[end]);
					continue;
				}

				int sp01 = arr[start] + Math.min(dp[start+2][end],dp[start+1][end-1]);
			
				int sp02 = arr[end] + Math.min(dp[start][end-2],dp[start+1][end-1]);
				
				dp[start][end] = Math.max(sp01, sp02);
				
			}
		}
		return dp[0][arr.length-1];
	}
}
