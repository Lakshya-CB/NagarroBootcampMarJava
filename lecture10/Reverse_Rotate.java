package lecture10;

import java.util.Arrays;

public class Reverse_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		
		System.out.println(Arrays.toString(arr));
//		reverse(arr);
//		System.out.println(Arrays.toString(arr));
		
//		rotate(arr,3);
		
		rotateFast(arr, 3);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void reverse(int[] arr)
	{
		int li = 0;
		int hi = arr.length-1;
		
		while(li<hi)
		{
			swap2(arr,li,hi);
			li += 1;
			hi -= 1;
		}
	}
	
	public static void reversePart(int[] arr,int li,int hi)
	{
		while(li<hi)
		{
			swap2(arr,li,hi);
			li += 1;
			hi -= 1;
		}
	}

	
	public static void rotate(int[] arr, int k)
	{
		k = k%arr.length;
		
		if(k<0)
		{
			k += arr.length;
		}
		
		for(int j = 1; j <= k; j++)
		{
			int temp = arr[arr.length-1];
			for(int i = arr.length-1; i >= 1; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void rotateFast(int[] arr, int k)
	{
		k = k%arr.length;
		
		if(k<0)
		{
			k += arr.length;
		}
		
		//A part reverse
		reversePart(arr, 0, arr.length-k-1);
		
		//B part Reverse
		reversePart(arr, arr.length-k, arr.length-1);
		
		//Full Reverse
		reverse(arr);
	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

}
