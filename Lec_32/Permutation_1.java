package Lec_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_1 {
	public static void main(String[] args) {
		String str = "BAA";
//		System.out.println('B'-'A');
//		solve(str, "");
//		int[] batua = new int[26];
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			batua[ch-'A']++;
//		}
//		sulve(batua, "");
//		System.out.println(Arrays.toString(batua));
		int[] arr = {1,1,2};
		List<List<Integer>> All_ans = new ArrayList<>();
		solve2(arr, new boolean[arr.length], new ArrayList<>(),All_ans);
		System.out.println(All_ans);
	}
//	public static void solve(String str, String ans) {
//		System.out.println(ans);
//		for(int i=0;i<str.length();i++) {
//			// select a char ?!!
//			if(i>0 && str.charAt(i)==str.charAt(i-1)) {
//				continue;
//			}
//			char ch = str.charAt(i);
//			//?
//			String str_updated = str.substring(0,i)+str.substring(i+1); 
//			solve(str_updated,ans+ch);
//		}
//	}
	
	public static void sulve(int[] batua, String ans) {
		System.out.println(ans);
		for(int i=0;i<batua.length;i++) {
			if(batua[i]>0) {
				char ch = (char)(i+'A');
				
				batua[i]=batua[i]-1;
				sulve(batua, ans+ch);
				batua[i]=batua[i]+1;
			}
		}
		
	}

	public static void solve(int[]  arr,boolean[] picked, String ans) {
		if(ans.length()==arr.length) {
			System.out.println(ans);
			
		}
//		System.out.println(ans);
		for(int i=0;i<arr.length;i++) {

			if(picked[i]==false) {
				picked[i]=true;
				solve(arr, picked, ans+arr[i]);
				picked[i]=false;
			}
		}
	}
	public static void solve2(int[]  arr,boolean[] picked, List<Integer> ans,List<List<Integer>> All_ans) {
		if(ans.size()==arr.length) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			
		}
//		System.out.println(ans);
		for(int i=0;i<arr.length;i++) {
//			pick up coin i
			if(i>0&&arr[i]==arr[i-1]&&picked[i-1]==false) {
				continue;
			}
			if(picked[i]==false) {
				picked[i]=true;
				ans.add(arr[i]);
				solve2(arr, picked, ans,All_ans);
				ans.remove(ans.size()-1);

				picked[i]=false;
			}
		}
	}
}
