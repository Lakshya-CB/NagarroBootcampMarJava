package QPS_7;

import java.util.Arrays;

public class Bus_Tour {
	public static void main(String[] args) {
		int[][] arr = { { 0, 2, 3 }, { -1, -1, -1 }, { 6, -1, 2 } };
		int ans = rec(arr, 0, 0);
		if (!found) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}

	static boolean found = false;

	public static int rec(int arr[][], int r, int c) {
		if (r == arr.length - 1 && c == arr[0].length - 1) {
			found = true;
//			for (int[] row : arr) {
//				System.out.println(Arrays.toString(row));
//			}
			int ans2 = rec_p2(arr, r, c);
//			System.out.println(ans2);
//			System.out.println("------------------------");
			return ans2;
		}
		
		if (r == arr.length || c == arr[0].length || arr[r][c] == -1) {
			return Integer.MIN_VALUE;
		}
		
		int temp = arr[r][c];
		arr[r][c] = 0;

		int sp1 = rec(arr, r, c + 1); // Right
		int sp2 = rec(arr, r + 1, c); // Down

		arr[r][c] = temp;
		
		if (Math.max(sp1, sp2) == Integer.MIN_VALUE) {
			
			return Integer.MIN_VALUE;
		}
		
		return Math.max(sp1, sp2) + arr[r][c];
	}

	public static int rec_p2(int arr[][], int r, int c) {
		if (r == 0 && c == 0) {
			return 0;
		}
		if (r == -1 || c == -1 || arr[r][c] == -1) {
			return Integer.MIN_VALUE;
		}
		int temp = arr[r][c];
		arr[r][c] = 0;

		int sp1 = rec_p2(arr, r, c - 1); // Right
		int sp2 = rec_p2(arr, r - 1, c); // Down

		arr[r][c] = temp;

		return Math.max(sp1, sp2) + arr[r][c];
	}
}
