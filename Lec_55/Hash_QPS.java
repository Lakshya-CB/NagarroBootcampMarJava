package Lec_55;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		inter(arr1, arr2);
		int [] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6}; 
		All_cons_Sequence(arr);
	}

	public static void inter(int[] arr1, int[] arr2) {
//				arr[i] , freq!!
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
//			if (map.containsKey(arr1[i])) {
//				int prev_freq = map.get(arr1[i]);
//				map.put(arr1[i], prev_freq + 1);
//			} else {
//				map.put(arr1[i], 1);
//			}
			int prev_freq= map.getOrDefault(arr1[i],0);
			map.put(arr1[i], prev_freq + 1);
		}
		System.out.println(map);

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])&&map.get(arr1[i])>0) {
				al.add(arr2[i]);
				int prev_freq = map.get(arr1[i]);
				map.put(arr1[i], prev_freq - 1);
			}
		}
		System.out.println(al);
	}
	
	public static void All_cons_Sequence(int[] arr) {
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i],false);
			}
			else {
				map.put(arr[i],true);
			}
			
//			if arr[i]+1 exist ?!! connect?!! vo fals enahi karna?!
			if(map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1, false);
			}
		}
		
//		O(n)
		System.out.println(map);
		for(int key: map.keySet()) {
			if(map.get(key)) {
				System.out.println("Head : " +key);
				
				int head = key;
				while(map.containsKey(head)) {
					System.out.print(head + " ");
					head++;
				}
				
				System.out.println();
			}
		}
	}
}
