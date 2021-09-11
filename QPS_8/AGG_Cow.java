package QPS_8;

import java.util.Arrays;
import java.util.Scanner;

public class AGG_Cow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int C = scn.nextInt();
		int[] stalls = new int[N];
		for (int i = 0; i < N; i++) {
			stalls[i] = scn.nextInt();
		}
		Arrays.sort(stalls);
//		int ans = 1;
//		for (int dist = stalls[0]; dist <= stalls[N - 1] - stalls[0]; dist++) {
//			if (check(stalls, dist, C)) {
//				ans = dist;
//			}
//			else {
//				break;
//			}
//			System.out.println(check(stalls, dist, C) + "  " + dist);
//		}
//		System.out.println(ans);
		int ans = 1;
		int start = 1;
		int end = stalls[N-1]-stalls[0];
		while(start<=end) {
			int dist = (start+end)/2;
			if(check(stalls, dist, C)) {
				ans = dist;
				start = dist+1;
			}
			else {
				end = dist-1;
			}
		}
		System.out.println(ans);
	}

	public static boolean check(int[] stalls, int dist, int total_C) {
		int prev = stalls[0];
		int curr_C = 1;
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - prev >= dist) {
				curr_C++;
				prev = stalls[i];
			}
		}
		if (curr_C >= total_C) {
			return true;
		} else {
			return false;
		}
	}
}
