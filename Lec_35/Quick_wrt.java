package Lec_35;

import java.util.Arrays;

public class Quick_wrt {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

		Quick_sort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	public static void Quick_sort(int[] arr, int start, int end) {
		if (start >= end) { // BC
			return;
		}
		// find pivot
		int mid = (start + end) / 2;
		int pivoot = arr[mid];
		// Swapping logic to place pivot at right location!
		int left = start;
		int right = end;
		
		while (true) {
			// move Left index!!
			while (arr[left] < pivoot) {
				left++;
			}
			// Find Right problem, or move right index
			while (arr[right] > pivoot) {
				right--;
			}
			// Swap!!
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			} else {
				break;
			}
		}
		//
		Quick_sort(arr, start, right);
		Quick_sort(arr, left, end);

	}
}
