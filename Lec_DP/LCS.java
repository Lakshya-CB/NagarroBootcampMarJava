package Lec_DP;

public class LCS {
	public static void main(String[] args) {
		String word1 ="abcdxewrfhsbjfbyntradfas";
		String word2 ="agcdsdvvdfasdcteerc";
		
		System.out.println(rec(word1, word2));
	}

	public static int rec(String word1, String word2) {
		if(word1.isEmpty()||word2.isEmpty()) {
			return 0;
		}
		if (word1.charAt(0) == word2.charAt(0)) {
			return 1 + rec(word1.substring(1), word2.substring(1));
		} else {
			int sp1 = rec(word1.substring(1), word2);
			int sp2 = rec(word1, word2.substring(1));

			return Math.max(sp1, sp2);
		}
	}
	public static int rec(String word1, String word2,int w1,int w2) {
		if(word1.length()==w1||word2.length()==w2) {
			return 0;
		}
		if (word1.charAt(w1) == word2.charAt(w2)) {
			return 1 + rec(word1, word2,w1+1,w2+1);
		} else {
			int sp1 = rec(word1, word2,w1+1,w2);
			int sp2 = rec(word1, word2,w1,w2+1);
			
			return Math.max(sp1, sp2);
		}
	}
	public static int rec(String word1, String word2,int w1,int w2,int[][]dp) {
		if(word1.length()==w1||word2.length()==w2) {
			return 0;
		}
		if(dp[w1][w2]!=-1){
			return dp[w1][w2];
		}
		if (word1.charAt(w1) == word2.charAt(w2)) {
			dp[w1][w2]= 1 + rec(word1, word2,w1+1,w2+1,dp);
			return dp[w1][w2];
		} else {
			int sp1 = rec(word1, word2,w1+1,w2,dp);
			int sp2 = rec(word1, word2,w1,w2+1,dp);
			dp[w1][w2]=Math.max(sp1, sp2);
			return Math.max(sp1, sp2);
		}
	}
	public static int BU(String word1, String word2) {
		int[][] dp = new int[word1.length()+1][word2.length()+1];
		for(int w1 = word1.length()-1; w1>=0;w1--) {
			for(int w2 = word2.length()-1;w2>=0;w2--) {
//				nor create the solution of dp[w1][w2];
				if (word1.charAt(w1) == word2.charAt(w2)) {
					dp[w1][w2]= 1 + dp[w1+1][w2+1];
				} else {
					int sp1 = dp[w1+1][w2];
					int sp2 = dp[w1][w2+1];
					dp[w1][w2]=Math.max(sp1, sp2);
				}
			}
		}
		return dp[0][0];
		
	}
}
