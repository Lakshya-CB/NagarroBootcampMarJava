package lecture13;

import java.util.Arrays;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for(int[] val : arr)
		{
			System.out.println(Arrays.toString(val));
		}
		System.out.println();
//		
//		System.out.println(Arrays.deepToString(arr));
//		
		wave(arr);
	}
	
	public static void wave(int[][] arr)
	{
		for(int col = 0; col < arr[0].length; col++)
		{
			if(col % 2 ==0) {
				for(int row = 0; row < arr.length;row++)
				{
	//				System.out.println(row+" "+col);
					System.out.print(arr[row][col]+" ");
				}
			}
			else
			{
				for(int row = arr.length-1; row >= 0 ;row--)
				{
	//				System.out.println(row+" "+col);
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
