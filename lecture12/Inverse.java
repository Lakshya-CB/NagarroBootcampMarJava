package lecture12;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,0,4,3};
		int[] res = new int[arr.length];
		inverse(arr,res);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(res));
		

	}
	
	public static int[] inverse(int[] arr,int[] res)
	{
		for(int i = 0; i < arr.length; i++)
		{
			res[arr[i]] = i;
		}
		
		return res;
	}

}
