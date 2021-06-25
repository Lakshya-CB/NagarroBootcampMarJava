package Lec_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1291_SequentialDigits {
	public static void main(String[] args) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			sulve(i, 100, 200000,ans);
		} 
		Collections.sort(ans);

		System.out.println(ans);

	}

	public static void sulve(int curr, int low, int high,List<Integer> ans) {

		if (curr >= low && curr <= high) {
//			System.out.println(curr);
			ans.add(curr);
		}

		int digit = curr % 10;
		if (curr > high || digit == 9) {
			return;
		}
		sulve(curr * 10 + digit + 1, low, high,ans);

	}
}
