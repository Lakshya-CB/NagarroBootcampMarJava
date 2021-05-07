package lecture10;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,45,50,60,65,70,80};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 61));

	}
	
	public static int binarySearch(int[] arr, int ele)
	{
		int li = 0;
		int hi = arr.length-1;
		while(li <= hi)
		{
			int mid = (li+hi)/2;
			if(arr[mid] == ele)
			{
				return mid;
			}
			else if(arr[mid] > ele)
			{
				hi = mid-1;
			}
			else
			{
				li = mid+1;
			}
		}
		return -1;
		
	}

}
