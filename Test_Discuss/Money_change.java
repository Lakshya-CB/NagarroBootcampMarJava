package Test_Discuss;

import java.util.Arrays;

public class Money_change {
	public static int Money_M1(int[] arr) {
//		calculate orignal Sum
		int ans_sum=0;
		for(int i=0;i<arr.length;i++) {
			ans_sum =ans_sum+(i+1)*arr[i];
		}
		
		int ans = ans_sum;
//		Display orignal array and resplay the amount !
		System.out.println(Arrays.toString(arr));
		System.out.println(ans);
		
		
		for(int i=0;i<arr.length;i++) {
//			Move i th Note to j th position 
			
			int prev = ans_sum; 
			for(int j=i+1;j<arr.length;j++) {
//				New amount!!
				prev = prev + arr[i]-arr[j];		
				ans = Math.max(ans, prev);
				
//				To display the Array and answer 
				
//				ArrayList<Integer> Al= new ArrayList<Integer>();
//				for (int kk : arr){
//				    Al.add(kk);
//				}
//				
//				Al.remove(i);
//				Al.add(j,arr[i]);
//				System.out.println(Al);
//				System.out.println(prev);

			}
			
			prev = ans_sum;
			for(int j=i-1;j>=0;j--) {
//				New amount!!
				prev = prev - arr[i] + arr[j];				
				ans = Math.max(ans, prev);
				
				
//				To display the Array and answer 
				
//				ArrayList<Integer> Al= new ArrayList<Integer>();
//				for (int kk : arr){
//				    Al.add(kk);
//				}
//				
//				Al.remove(i);
//				Al.add(j,arr[i]);
//				System.out.println(Al);
//				System.out.println(prev);

			}
		}
		return ans;
	}
	
}
