package Lec_15;

import java.util.ArrayList;

public class Interc_arrr2 {
	public static void main(String[] args) {
		int[] one = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int[] two = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		System.out.println(inter(one, two));
	}

	public static ArrayList<Integer> inter(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		// logic
		int p1 = 0;
		int p2 = 0;
		while (p1 < one.length && p2 < two.length) {
			if(one[p1]==two[p2]) {
				ans.add(one[p1]);
				p1++;
				p2++;
			}
			else if(one[p1]<two[p2]) {
				p1++;
			}
			else {
				p2++;
			}
		}

		return ans;
	}

}
