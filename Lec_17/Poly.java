package Lec_17;

public class Poly {
	public static void main(String[] args) {
		System.out.println(solve(7,3));
	}

	public static int solve(int x, int n) {
		int sum = 0;
		int x_pow = x;
		for (int coff = n; coff >= 1; coff--) {
			sum = coff * x_pow + sum;
			x_pow = x_pow * x;
		}

		return sum;
	}
}
