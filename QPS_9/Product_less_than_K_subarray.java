package QPS_9;

public class Product_less_than_K_subarray {
	 public int numSubarrayProductLessThanK(int[] nums, int k) {
	        int product = 1;
	        int start=0;
	        int end =0;
	        int ans =0;
	        while(start<nums.length){
	            end = Math.max(start,end);
	            product = Math.max(product,1);
	            if(end<nums.length&&product*nums[end]<k){
	                product=product*nums[end];
	                end++;
	                ans = ans + (end-start);
	            }
	            else{
	                // if(product>1){
	                //     product=product/nums[start];
	                // }
	                product=product/nums[start];
	                
	                start++;
	            }
	        }
	        return ans;
	    }
}
