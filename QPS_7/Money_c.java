package QPS_7;

import java.util.ArrayList;

public class Money_c {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 3, 1 };
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		ArrayList<Integer> Al = new ArrayList<>();
		for (int ll : arr) {
			Al.add(ll);
		}
		int org_amount = amount(Al);
		int ans = org_amount;
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> curr = new ArrayList<Integer>(Al);
//			System.out.println(curr + "  " + amount(curr));
//			System.out.println("-----------------------");
//			curr.remove(i);
			int amount = org_amount;
			for (int j = i + 1; j < arr.length; j++) {
//				curr.add(j, arr[i]);
				amount = amount + arr[i] - arr[j];
//				System.out.println(curr + "  " + amount(curr) + " " + amount);
//				curr.remove(j);
				ans = Math.max(amount, ans);
			}
			amount = org_amount;
//			System.out.println("*");
			for (int j = i - 1; j >= 0; j--) {
//				curr.add(j, arr[i]);
				amount = amount - arr[i] + arr[j];
//				System.out.println(curr + "  " + amount(curr) + " " + amount);
//				curr.remove(j);

				ans = Math.max(amount, ans);
			}
//			System.out.println("-----------------------");
		}
		return ans;
	}

	public static int amount(ArrayList<Integer> AL) {
		int sum = 0;
		for (int i = 0; i < AL.size(); i++) {
			sum += AL.get(i) * (i + 1);
		}
		return sum;
	}
}
