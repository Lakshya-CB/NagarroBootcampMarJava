package Lec_30;

import java.util.ArrayList;
import java.util.List;

public class combination {
	public static void main(String[] args) {
		int[] candidates = { 2, 3, 5 };
		int target = 8;
		List<List<Integer>> All_ans = new ArrayList<>();
//		Coin_den_comb_wrt_C(candidates, target, 0, new ArrayList<>(), All_ans);
		Coin_den_comb_wrt_U(candidates, target, 0, new ArrayList<>(), All_ans);
		System.out.println(All_ans);
	}

	public static void Coin_den_comb_wrt_C(int[] coins, int Amount, int index_coin, List<Integer> ans,
			List<List<Integer>> All_ans) {

		if (Amount < 0 || index_coin == coins.length) {
			return;
		}

		if (Amount == 0) {
			// System.out.println(ans);
			// System.out.println("asdfasfasdfaf");
			All_ans.add(new ArrayList<>(ans));
			return;
		}
		Coin_den_comb_wrt_C(coins, Amount, index_coin + 1, ans, All_ans); // nahi select

		ans.add(coins[index_coin]);
		Coin_den_comb_wrt_C(coins, Amount - coins[index_coin], index_coin, ans, All_ans); // Select
		ans.remove(ans.size() - 1); // Explicit ! !!

	}

	public static void Coin_den_comb_wrt_U(int[] coins, int Amount, int prev_index, List<Integer> ans,
			List<List<Integer>> All_ans) {
		if (Amount < 0) {
			return;
		}
		if (Amount == 0) {
//			System.out.println(ans);
			All_ans.add(new ArrayList<>(ans));
			return;
		}
		for (int i = prev_index; i < coins.length; i++) {
			ans.add(coins[i]);
			Coin_den_comb_wrt_U(coins, Amount - coins[i], i, ans, All_ans);
			ans.remove(ans.size() - 1);

		}
	}
}
