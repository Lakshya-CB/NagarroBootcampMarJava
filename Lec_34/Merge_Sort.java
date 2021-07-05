package Lec_34;

import java.util.Arrays;

public class Merge_Sort {
	public static void main(String[] args) {
		int[] arr1 = {10,20};
		int[] arr2 = {5,15,35,45,75};
		System.out.println(Arrays.toString(Merge_array(arr1, arr2)));
		int[] arr = {1,4312,146,2,671,652,753,345689,1254,52,-2,3};
		System.out.println(Arrays.toString(Merge_Sort(arr, 0, arr.length-1)));
	}

	public static int[] Merge_array(int[] arr1, int[] arr2) {
		int[] new_array = new int[arr1.length + arr2.length];
		int p1 = 0;
		int p2 = 0;
		int i = 0;
		while (p1 < arr1.length && p2 < arr2.length) {

			if (arr1[p1] <= arr2[p2]) {
				new_array[i] = arr1[p1];
				p1++;
				i++;
			} else {
				new_array[i] = arr2[p2];
				p2++;
				i++;
			}
		}
		while (p1 < arr1.length) {
			new_array[i] = arr1[p1];
			p1++;
			i++;
		}
		while (p2 < arr2.length) {
			new_array[i] = arr2[p2];
			p2++;
			i++;
		}
		return new_array;
	}

	public static int[] Merge_Sort(int[] arr, int start, int end) {
		
		if(start==end) {
			// Sp is having only one element
			int[] sp = new int[1];
			sp[0]= arr[start];
			return sp;
		}
		int mid = (start+end)/2;
		int[] sp1 = Merge_Sort(arr, start, mid);
		int[] sp2 = Merge_Sort(arr, mid+1,end);
		return Merge_array(sp1,sp2);
		
	}
			
}
