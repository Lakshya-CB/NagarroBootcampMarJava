package Lec_25;

import java.util.ArrayList;
import java.util.List;

public class Rec {
	static int count = 0;

	public static void main(String[] args) {
//		Gen_par(3, 0, 0, "");
		count = 0;
//		ArrayList<String>All_ans = new ArrayList<>();		
//		climb(0, 5, "",All_ans);
//		System.out.println(count);
//		System.out.println(All_ans);
//		maaze(0, 0, 2, 2, "");\
		perm("abc","");
	}

	public static void Gen_par(int n, int num_o, int num_c, String ans) {
		if (num_o == n && num_c == n) { // +ve Bc
			System.out.println(ans);
			return;
		}
		if (num_o > n || num_c > n || num_c > num_o) { // -ve BC
			return;
		}
		Gen_par(n, num_o + 1, num_c, ans + "(");
		Gen_par(n, num_o, num_c + 1, ans + ")");
	}

	public static void climb(int curr_lvl, int dest_lvl, String ans, ArrayList<String> All_ans) {
		if (curr_lvl > dest_lvl) { // -ve BC
			return;
		}

		if (curr_lvl == dest_lvl) { // +ve Bc?
//			System.out.println(++count+ "  :"+ ans);
			All_ans.add(ans);
			return;
		}
		for (int i = 1; i <= 3; i++) {
			climb(curr_lvl + i, dest_lvl, ans + i, All_ans);
		}

	}

	public static void maaze(int curr_x, int curr_y, int dest_x, int dest_y, String ans) {
		if (curr_x == dest_x && curr_y == dest_y) {
			System.out.println(ans);
			return;
		}

		if (curr_x > dest_x || curr_y > dest_y) {
			return;
		}
		maaze(curr_x + 1, curr_y, dest_x, dest_y, ans + "D");
		maaze(curr_x, curr_y + 1, dest_x, dest_y, ans + "R");
//		maaze(curr_x+1, curr_y+1, dest_x, dest_y,ans+"Diagonal");

	}

	public static void perm(String str, String ans) {
		// -ve BC XDXDXD NO Never
		// +ve Bc
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // selected a at index i;
			String sp = str.substring(0, i) + str.substring(i + 1); // bc
			perm(sp, ans + ch);
		}

	}
}
