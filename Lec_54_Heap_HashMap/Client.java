package Lec_54_Heap_HashMap;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		HeapG<Integer> H = new HeapG<Integer>();
		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
//		[[10,20,30], 
//		 [15,35], 
//		 [5,7,12,25] , 
//		 [17, 22, 40]] 
		AL.add(new ArrayList<Integer>());
		AL.get(0).add(10);
		AL.get(0).add(20);
		AL.get(0).add(30);

		AL.add(new ArrayList<Integer>());
		AL.get(1).add(15);
		AL.get(1).add(35);

		AL.add(new ArrayList<Integer>());
		AL.get(2).add(5);
		AL.get(2).add(7);
		AL.get(2).add(12);
		AL.get(2).add(25);

		AL.add(new ArrayList<Integer>());
		AL.get(3).add(17);
		AL.get(3).add(22);
		AL.get(3).add(40);
//		System.out.println(AL);
//		Merge_k(AL);
		int[] arr = {20,30,60,50,10,55,57,40};
		largest_k(arr, 3);
	}

	static class pair implements Comparable<pair> {
		int data;
		int arr_idx;
		int ele_idx;

		@Override
		public int compareTo(pair o) {
//			this - o;

//A			return this.data-o.data; because our Heap_G was designed to treat Integer class as RANK!!
//B			return o.data-this.data;

			return this.data - o.data;
		}

		public String toString() {
			return "data : " + data + " ; arr - " + arr_idx + " ; ele - " + ele_idx;
		}
	}

	public static void Merge_k(ArrayList<ArrayList<Integer>> AL) {
		HeapG<pair> H = new HeapG<>();
		ArrayList<Integer> merged = new ArrayList<Integer>();

//		O(klogk)
		for (int i = 0; i < AL.size(); i++) {
			pair ll = new pair();
			ll.arr_idx = i;
			ll.ele_idx = 0;
			ll.data = AL.get(i).get(0);
			H.add(ll);
//			System.out.println(ll);
		}

		while (!H.isEmpty()) {
//			min element!!
			pair ll = H.poll();
			System.out.println(ll);
			merged.add(ll.data);
			
			ll.ele_idx = ll.ele_idx + 1;
			if (ll.ele_idx < AL.get(ll.arr_idx).size()) {
				ll.data = AL.get(ll.arr_idx).get(ll.ele_idx);
				H.add(ll);
			}
			
		}
		System.out.println(merged);
	}
	public static void largest_k(int [] arr,int k) {
		HeapG<Integer> H = new HeapG<>();
		for(int i=0;i<k;i++) {
			H.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			H.add(arr[i]);
			H.poll();
		}
		H.disp();
	}
}
