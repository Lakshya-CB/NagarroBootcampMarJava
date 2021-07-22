package Lec_42_43;

public class Sorted_array {
	public static void main(String[] args) {
		int[] A = { 10, 15, 25 };
		int[] B = { 1, 5, 20, 30 };
		game(A, -1, B, -1, "", true);
	}

	public static void game(int[] A, int prev_A, int[] B, int prev_B, String ans, boolean Turn_A) {

		if (Turn_A) {
//			+ve BC
			if (prev_B > -1) {
				System.out.println(ans);

			}

			for (int i = prev_A + 1; i < A.length; i++) {
				if (prev_B == -1 || A[i] > B[prev_B]) {
//				 Select I th inedx form the array A
					game(A, i, B, prev_B, ans + A[i] + " ", false);
				}
			}
		} else {
			for (int i = prev_B + 1; i < B.length; i++) {
//				 Select I th inedx form the array B
				if (prev_A == -1 || B[i] > A[prev_A]) {

					game(A, prev_A, B, i, ans + B[i] + " ", true);

				}
			}
		}

	}

}
