package QPS_5;

import java.util.HashMap;

public class diff_Pairs_in_an_Array {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 1, 5 };
		int k = 0;
		findPairs(arr, k);
	}

	public static int findPairs(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int ele : nums) {
//			A 1:
//			if (map.containsKey(ele)) {
//				map.put(ele, map.get(ele) + 1);
//			} else {
//				map.put(ele, 1);
//			}
//			A 2:
			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}
		System.out.println(map);
		
		int ans = 0;
		System.out.println(map.keySet());
		for (int key : map.keySet()) {
			if (k == 0) {
				if (map.get(key) > 1) {
					ans = ans + 1;
					System.out.println(key + " - " + (key - k));
				}
			}

			if (k != 0) {
				if (map.containsKey(key - k) && map.get(key - k) > 0) {
					ans++;
					System.out.println(key + " - " + (key - k));
				}
				if (map.containsKey(key + k) && map.get(key + k) > 0) {
					ans++;
					System.out.println(key + " - " + (key + k));
				}
				map.put(key, 0); // Assuming 0 for all pairs extracted!!
//			map.remove(key); Do not use!! 
			}
		}
		return ans;
	}
}
