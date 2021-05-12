package lecture12_1;

import java.util.Arrays;

public class Sorting_Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,4,5,1};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		System.out.println(minimum(arr, 2, 3));
		

	}
	
	public static int minimum(int[] arr, int si, int ei) {
		
		int min = si;
		for(int i = si+1; i <= ei; i++)
		{
			if(arr[min] > arr[i])
			{
				min = i;
			}
		}
		
		return min;
	}
	
	public static void sort(int[] arr)
	{
		for(int i = 0; i <= arr.length-2; i++)
		{
			int min = minimum(arr, i, arr.length-1);
			swap2(arr,i,min);
		}
	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

}
