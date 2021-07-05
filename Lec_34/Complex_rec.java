package Lec_34;

public class Complex_rec {
	public static void main(String[] args) {
		System.out.println(pow(3, 0));
	}

	public static int pow(int a, int n) {
		// BC ?!?
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 1) {
			int sp = pow(a, n / 2);
			return sp * sp * a;
		} else {
			int sp = pow(a, n / 2);
			return sp * sp;
		}
	}
}
