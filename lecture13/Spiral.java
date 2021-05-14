package lecture13;

import java.util.Arrays;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20}};
		
		for(int[] val : arr)
		{
			System.out.println(Arrays.toString(val));
		}
		System.out.println();
		spiral(arr);
		

	}
	public static void spiral(int[][] arr)
	{
		int min_row = 0;
		int min_col = 0;
		
		int max_row = arr.length-1;
		int max_col = arr[0].length-1;
		
		int count = 0;
		while(count < arr.length*arr[0].length)
		{
			for(int i = min_col; i <= max_col && count < arr.length*arr[0].length; i++)
			{
				System.out.print(arr[min_row][i]+" ");
				count++;
			}
			min_row += 1;
			
			for(int i = min_row; i <= max_row; i++)
			{
				System.out.print(arr[i][max_col]+" ");
				count++;
			}
			max_col -= 1;
			
			for(int i = max_col; i >= min_col; i--)
			{
				System.out.print(arr[max_row][i]+" ");
				count++;
			}
			max_row -= 1;
			
			for(int i = max_row; i >= min_row; i--)
			{
				System.out.print(arr[i][min_col]+" ");
				count++;
			}
			min_col += 1;
		}
		
	}

}
