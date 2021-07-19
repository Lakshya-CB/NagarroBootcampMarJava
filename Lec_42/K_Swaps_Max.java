package Lec_42;

import java.util.Scanner;

public class K_Swaps_Max {
	static int max= 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String num = scn.next();
		int K = scn.nextInt();
		char[] num_arr = num.toCharArray();
		K_swap(num_arr, K, "");
		System.out.println(max);
	}
		
	public static void K_swap(char[] num_arr, int K, String aa) {
		if(K==0) {
//			System.out.println(num_arr);
//			String number = new String(num_arr);
			String number = String.valueOf(num_arr);
			
//			for(char cc : num_arr) {
//				number = number+cc;
//			}
			
//			System.out.println(number);
			int curr_number = Integer.valueOf(number);
			max = Math.max(max, curr_number);
//			System.out.println(Integer.valueOf(number));
//			System.out.println(aa);
			return;
		}
		for(int i=0;i<num_arr.length;i++) {
			for(int j=i+1; j<num_arr.length;j++) {
				if(num_arr[j]>num_arr[i]) {
//					Swap
					swap(num_arr, i, j);
					K_swap(num_arr, K-1, aa + "{"+i+","+j+"}");
//					Unswap!!
					swap(num_arr, j, i);
				}
			}
		}
	}
	public static void swap(char[]arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
