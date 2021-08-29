package Lec_DP;

public class EEdit_ {
	public static void main(String[] args) {

	}

	public static int minDistance(String word1, String word2) {
			if(word1.isEmpty() && !word2.isEmpty()) {
				return word2.length();
						
			}
			if(!word1.isEmpty() && word2.isEmpty()) {
				return word1.length();
						
			}
			if(word1.isEmpty() && word2.isEmpty()) {
				return 0;
						
			}
//			A2 :
//			if(word1.isEmpty()||word2.isEmpty()) {
//				return Math.max(word1.length(), word2.length());
//			}
			if(word1.charAt(0)==word2.charAt(0)){
				return minDistance(word1.substring(1), word2.substring(1));
			}
			else {
				int Case_I = minDistance(word1, word2.substring(1));
				int Case_D = minDistance(word1.substring(1), word2);
				int Case_R = minDistance(word1.substring(1), word2.substring(1));
				
				return 1+Math.min(Case_D, Math.min(Case_I, Case_R));
			}
		}
	public static int minDistance(String word1, String word2,int w1, int w2) {
		if(word1.length()==w1||word2.length()==w2) {
			return Math.max(word1.length()-w1, word2.length()-w2);
		}
		
		if(word1.charAt(w1)==word2.charAt(w2)){
			return minDistance(word1, word2,w1+1,w2+1);
		}
		else {
			int Case_I = minDistance(word1, word2,w1,w2+1);
			int Case_D = minDistance(word1, word2,w1+1,w2);
			int Case_R = minDistance(word1, word2,w1+1,w2+1);
			
			return 1+Math.min(Case_D, Math.min(Case_I, Case_R));
		}
	}
	public static int TD(String word1, String word2,int w1, int w2,int[][] dp) {
		if(word1.length()==w1||word2.length()==w2) {
			return Math.max(word1.length()-w1, word2.length()-w2);
		}
		
        if(dp[w1][w2]!=-1){
            return dp[w1][w2];
        }
		if(word1.charAt(w1)==word2.charAt(w2)){
			dp[w1][w2] = TD(word1, word2,w1+1,w2+1,dp);
			return dp[w1][w2];
		}
		else {
			int Case_I = TD(word1, word2,w1,w2+1,dp);
			int Case_D = TD(word1, word2,w1+1,w2,dp);
			int Case_R = TD(word1, word2,w1+1,w2+1,dp);
			dp[w1][w2] = 1+Math.min(Case_D, Math.min(Case_I, Case_R));
			return dp[w1][w2];
		}
	}
	public static int BU(String word1, String word2) {
		int[][] dp = new int[word1.length()+1][word2.length()+1];
		for(int w1 = word1.length();w1>=0;w1--) {
			for(int w2 = word2.length();w2>=0;w2--) {
//				create dp[w1][w2]
				if(word1.length()==w1||word2.length()==w2) {
					dp[w1][w2]=Math.max(word1.length()-w1, word2.length()-w2);
					continue;
				}
				if(word1.charAt(w1)==word2.charAt(w2)){
					dp[w1][w2] = dp[w1+1][w2+1];
				}
				else {
					int Case_I = dp[w1][w2+1];
					int Case_D = dp[w1+1][w2];
					int Case_R = dp[w1+1][w2+1];
					dp[w1][w2] = 1+Math.min(Case_D, Math.min(Case_I, Case_R));
				}
			}
		}
		return dp[0][0];
	}
}
