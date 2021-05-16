package QPS1;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]x = {{1,2,3},{4,5,6}};
		int [][] y = {{1,4},{2,5},{3,6}};
		
		int [][] z = new int[x.length][y[0].length];
		
		for(int row = 0; row < x.length; row++)
		{
			for(int col = 0; col < y[0].length; col++)
			{
				int ans = 0;
				for(int k = 0; k <y.length; k++)
				{
					ans += x[row][k] * y[k][col];
				}
				z[row][col] = ans;
			}
		}
		
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.deepToString(y));
		System.out.println(Arrays.deepToString(z));

	}

}
