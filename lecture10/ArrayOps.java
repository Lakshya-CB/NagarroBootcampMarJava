package lecture10;

import java.util.Arrays;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,15,30,25,30,60,30};
		
		System.out.println(Arrays.toString(arr));
		
		int max = maximum(arr);
		System.out.println(max);
//		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(search(arr,30));
		int[] ar = searchAllOccurance(arr,30);
		System.out.println(Arrays.toString(ar));
		
//		display(arr);
		
		

	}
	
	public static int search(int[] arr,int ele)
	{
		int ans = -1;
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] == ele)
			{
				ans = i;
				break;
			}
			
		}
		return ans;
	}
	
	public static int[] searchAllOccurance(int[] arr,int ele)
	{
		int count = 0;
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] == ele)
			{
				count++;
			}
			
		}
		
		int[] ans = new int[count];
		int j = 0;
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] == ele)
			{
				ans[j] = i;
				j++;
			}
		}
		return ans;
	}
	
	public static int maximum(int[] arr)
	{
//		int max = Integer.MIN_VALUE;
		int max = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	static public void display(int[] arr)
	{
		for(int val : arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		
	}

}
