package Lec_31;

import java.util.ArrayList;
import java.util.List;

public class _77_Combinations {
	public static void main(String[] args) {
			List<List<Integer>> All_ans = new ArrayList<>();
			sovle(5, 2, 1, new ArrayList<>(),All_ans,0);
//			System.out.println(All_ans);
		}
		
		public static void sovle(int n,int k,int curr,List<Integer> ans,List<List<Integer>> All_ans,int sum) {
			
			
			if(k==0 &&  0==n) { // +BC
	//			System.out.println(ans);
				All_ans.add(new ArrayList<>(ans));
				return;
			}
			if(curr>9 || k<0 || n<0) { // -ve BC
				return;
			}
			System.out.println(ans);
			ans.add(curr);
			sovle(n-curr, k-1, curr+1, ans,All_ans,sum+curr); // P
			ans.remove(ans.size()-1);
			
			sovle(n, k, curr+1, ans,All_ans,sum); // NP
		}
	}
