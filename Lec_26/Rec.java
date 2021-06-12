package Lec_26;

public class Rec {

	public static void main(String[] args) {
//		Coin_No_cons_H(4, "", false);
//		lexico_count(1000, 0);

		// Way 1
//		System.out.println(0);
//		for (int i = 1; i <= 9; i++) {
//			jump(105, i);
//		}
		// Way 2
//		jump(105, 0);
		partitionPalin("lonitinol", "");
	}

	public static void Coin_No_cons_H(int n, String ans, boolean check) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (check) {
			Coin_No_cons_H(n - 1, ans + "T", false);

		} else {
			Coin_No_cons_H(n - 1, ans + "H", true);
			Coin_No_cons_H(n - 1, ans + "T", false);
		}
	}

	public static void lexico_count(int n, int curr) {

		if (curr > n) { // -ve BC
			return;
		}
		System.out.println(curr);
		int initialized = 0;
		if (curr == 0) {
			initialized = 1;
		}
		for (int i = initialized; i <= 9; i++) {
			lexico_count(n, curr * 10 + i);
		}

	}

	public static void jump(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		// Way 2
		if (curr == 0) {
			for (int i = 1; i <= 9; i++) {
				jump(n, i);
			}
			return;
		}

		//
		int digit = curr % 10;

		if (digit != 0) {
			jump(n, curr * 10 + digit - 1);
		}
		if (digit != 9) {
			jump(n, curr * 10 + digit + 1);
		}
	}

	public static void partition(String str, String ans) {

		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {
			String chopped = str.substring(0, i);
			String rem = str.substring(i);
			partition(rem, ans + chopped + ",");
		}
	}

	public static void partitionPalin(String str, String ans) {

		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {
			String chopped = str.substring(0, i);
			String rem = str.substring(i);
			if (check_Palin(chopped)) {
				partitionPalin(rem, ans + chopped + ",");
			}
//			else{ // -BC
//				continue;
//			}
			
		}
	}

	public static boolean check_Palin(String str) {
		int low = 0;
		int high = str.length() - 1;

		while (low < high) {
			//
			// O(n2)
			if (str.charAt(high) == str.charAt(low)) {
				low++;
				high--;

			} else {
				return false;
			}
		}
		return true;
	}
}
