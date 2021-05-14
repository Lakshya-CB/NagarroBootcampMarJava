package lecture13;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][5];
		System.out.println(arr);
		int[] a = arr[0];
		System.out.println(a);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0][0] = 10;
		arr[2][4] = 30;
		
		System.out.println(a[0]);
		
		for(int[] val : arr)
		{
			for(int x : val)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		for(int row = 0; row < arr.length; row++)
		{
			for(int col = 0; col < arr[0].length; col++)
			{
//				System.out.print(arr[row][col] +" ");
				arr[row][col] = sc.nextInt();
			}
			System.out.println();
		}
		
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
