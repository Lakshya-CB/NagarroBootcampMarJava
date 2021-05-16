package QPS1;

import java.util.Arrays;

public class LowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3,3,4,4,10,10,10,10};
		
		int ele = 20;
		int low = 0; 
		int high = arr.length-1;
		
		int ans = -1;
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == ele)
			{
				ans = mid;
//				high = mid-1;
				low = mid+1;
			}
			else if (arr[mid] > ele)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(ans);

	}

}
