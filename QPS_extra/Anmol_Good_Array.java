package QPS_extra;

import java.util.HashMap;

public class Anmol_Good_Array {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, -3, -4, 1, 2, -3, 6, -2, 1 };
		int[] arr = { 0, 0, 0, 0, 0, 1, 2, 3 };
		ans(arr);
	}

	public static void ans(int[] arr) {
		HashMap<Long, Integer> map = new HashMap<>();
		long sum = 0l;
		int pos = Integer.MIN_VALUE;
		int ans = 0;
//		To handle the case of {41,-41}
		map.put(0l, -1);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				pos = i - 1;
				continue;
			}
			sum = sum + arr[i];
			if (map.containsKey(sum)) {
//				Pos + 1 is storing the last index which should not be included in good subarrays 
				pos = Math.max(pos, map.get(sum));
			}

			
			if (pos == Integer.MIN_VALUE) {
				ans = ans + i + 1;
			} else {
				ans = ans + i - pos - 1;

			}
//			System.out.println(ans + " " + arr[i]);
//			Put your sum with index in the map
			map.put(sum, i);
		}
		System.out.println(ans);
	}
}
