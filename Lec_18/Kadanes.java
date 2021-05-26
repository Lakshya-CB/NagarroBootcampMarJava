package Lec_18;

import java.util.Scanner;

public class Kadanes {
	public static void main(String[] args) {
//		int[] arr = { -10, -20, -30, -1 };
//		System.out.println(Algo_Kad(arr));
		Scanner scn = new Scanner(System.in);
		int test_cases = scn.nextInt();
		for(int ttt=1;ttt<=test_cases;ttt++) {
			int size = scn.nextInt();
			int[] arr = new int[size];
			for(int i=0;i<size;i++) {
				
				arr[i]= scn.nextInt();
				
			}
			System.out.println(circ_sum(arr));
		}
	}
	public static int circ_sum(int[] arr) {
		int case1 = Algo_Kad(arr); // O(n)
		
//		 case2 
		int sum=0;// A-B; A is pos sum B is neg sum
		for(int i=0;i<arr.length;i++) { //O(n)
			sum = sum+arr[i];
			arr[i]=-1*arr[i]; // converting array to find B by Kadance ?
		}
		int B =  Algo_Kad(arr); // O(n)
		int case2 = sum+B;
		
		return Math.max(case2, case1); 
		
	}
	public static int Algo_Kad(int[] arr) {
		int max_sum = Integer.MIN_VALUE;
		int curr_sum = 0;
		for (int i = 0; i < 2*arr.length-1; i++) {
			curr_sum = curr_sum + arr[i];

			if (curr_sum < 0) {
				curr_sum = 0;
			}

			if (max_sum < curr_sum) {
				max_sum = curr_sum;
			}
		}
		return max_sum;

	}
}
