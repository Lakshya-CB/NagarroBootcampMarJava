package QPS1;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int[] ans = new int[arr.length];
		
//		int[] leftp = new int[arr.length];
		
		ans[0] = 1;
		int p = 1;
		for(int i = 1; i < arr.length; i++)
		{
			p = p*arr[i-1];
			ans[i] = p;
		}
		
		System.out.println(Arrays.toString(ans));
		
//		int[] rightp = new int[arr.length];
		
//		rightp[arr.length-1] = 1;
		p = 1;
		for(int i = arr.length-2; i >= 0; i--)
		{
			p = p*arr[i+1];
			ans[i] = ans[i]*p;
		}
		
		System.out.println(Arrays.toString(ans));
		
//		for(int i = 0; i < arr.length; i++)
//		{
//			ans[i] = leftp[i]*rightp[i];
//		}
//		
//		System.out.println(Arrays.toString(ans));

	}

}
