package Lec_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _78_Subsets {
	public static void main(String[] args) {
		int[] arr = { 2, 2,3,4 };
		Arrays.sort(arr);
		List<List<Integer>> All_ans = new ArrayList<>();
		suvle(arr, 0, new ArrayList<>(),All_ans,true);
		System.out.println(All_ans);
//		solve(arr, 0, "");
	}

	public static void suvle(int[] arr, int index, List<Integer> ans,List<List<Integer>> All_ans,boolean flag) {
		if (index == arr.length) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}

		if(flag==false &&arr[index]==arr[index-1]) {
			suvle(arr, index + 1, ans,All_ans,false);
			return;
		}
		ans.add(arr[index]);
		suvle(arr, index + 1, ans ,All_ans,true); // P
		ans.remove(ans.size()-1);
		
		suvle(arr, index + 1, ans,All_ans,false);

	}
	public static void solve(int[] arr, int index, String ans) {
		if (index == arr.length) {
			System.out.println(ans);
//			return;
		}
		if (index >= arr.length)
			return;
		solve(arr, index + 1, ans);
		solve(arr, index + 1, ans + arr[index]);
	}

}
