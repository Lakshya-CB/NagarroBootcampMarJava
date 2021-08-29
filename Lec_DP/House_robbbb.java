package Lec_DP;

public class House_robbbb {
	public static void main(String[] args) {

	}
	
//  https://leetcode.com/problems/house-robber/
	
	public static int rec(int[] nums, int idx, int[] dp) {
		if (idx >= nums.length) {
			return 0;
		}
		
		if (dp[idx] != -1) {
			return dp[idx];
		}
		
		int C1 = nums[idx] + rec(nums, idx + 2, dp);
		int C2 = rec(nums, idx + 1, dp);

		dp[idx] = Math.max(C1, C2);

		return Math.max(C1, C2);
	}

	public static int BU(int[] nums) {
		int[] dp = new int[nums.length+2];
		for (int i = nums.length - 1; i >= 0; i--) {
			int C1 = nums[i] + dp[i + 2];
			int C2 = dp[i + 1];

			dp[i] = Math.max(C1, C2);
		}
		return dp[0];
	}
//	House Robber tu! https://leetcode.com/problems/house-robber-ii/submissions/
	 public int rob(int[] nums) {
	        if(nums.length==1){
	            return nums[0];
	        }
//	         Case 1: exclusive last house!!
	        int[] dp_C1 = new int[402];
			for (int i = nums.length - 2; i >= 0; i--) {
				int C1 = nums[i] + dp_C1[i + 2];
				int C2 = dp_C1[i + 1];
				dp_C1[i] = Math.max(C1, C2);
			}
	        int C11 = dp_C1[0];
	        
//	         Case 2: exclusive first house!!
	        int[] dp_C2 = new int[402];
			for (int i = nums.length - 1; i >= 1; i--) {
				int C1 = nums[i] + dp_C2[i + 2];
				int C2 = dp_C2[i + 1];
				dp_C2[i] = Math.max(C1, C2);
			}
	        int C22 = dp_C2[1];
	        
			return Math.max(C11,C22);
		}
}
