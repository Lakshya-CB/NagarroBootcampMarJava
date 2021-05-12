package lecture12_1;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,4,2,1};
		is(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
	public static void is(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int ele = arr[i];
			for(int j = i-1; j >= 0; j--)
			{
				if(arr[j] > ele)
				{
					arr[j+1] = arr[j];
				}
				else
				{
					arr[j+1] = ele;
					break;
				}
			}
			if(arr[0] > ele)
			{
				arr[0] = ele;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
