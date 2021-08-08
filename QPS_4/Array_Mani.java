package QPS_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Mani {
	public static void main(String[] args) {
		manipulation(5, 3);
	}

	public static void manipulation(int s, int num_q) {
		int[] arr = new int[s + 2];
		Scanner scn = new Scanner(System.in);
//		O(q*n) 
		for (int q = 0; q < num_q; q++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int k = scn.nextInt();
//			for (int ll = a; ll <= b; ll++) {
//				arr[ll] = arr[ll] + k;
//			}
			arr[a] = arr[a] + k;
			arr[b + 1] = arr[b + 1] - k;
		}
		int sum=0; 
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<s+2;i++) {
			sum = sum +arr[i];
			System.out.print(sum + " ");
		}
	}
	
}
