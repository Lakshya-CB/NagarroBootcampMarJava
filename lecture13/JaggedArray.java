package lecture13;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[] a = new int[3];
		arr[0] = a;
		arr[1] = new int[2];
		arr[2] = new int[5];
		System.out.println(arr[0]);
		
		arr[0] = new int [4];
		
		for(int row = 0; row < arr.length; row++)
		{
			for(int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] +" ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		for(int[] val : arr)
		{
			for(int x : val)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		

	}

}
