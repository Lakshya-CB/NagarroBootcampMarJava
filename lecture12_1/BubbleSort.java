package lecture12_1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,4};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);

	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i <= arr.length-2; i++)
		{
			int swap = 0;
			for(int j = 0; j <= arr.length-2-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap++;
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			if(swap == 0)
			{
				break;
			}
			System.out.println(Arrays.toString(arr));
			}
	}
	
	

}
