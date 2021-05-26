package Lec_18;

public class SOE_2 {
	public static void main(String[] args) {
		Soe(25);
	}

	public static void Soe(int n) {
		boolean[] prime = new boolean[n + 1];
		// boolean default value ? False
		for (int i = 2; i <= n; i++) { // from 2 to n
			prime[i] = true;
		}

		// table start
		for (int factor = 2; factor * factor <= n; factor++) {// Math.sqrt same ting : 2 to sqrt(n) 5
			if (prime[factor]) {
				for (int mult = 2; factor * mult <= n; mult++) {
					prime[factor * mult] = false;
				}
			}
		}
		for (int i = 0; i <= n; i++) {
			if (prime[i]) {
				System.out.print(i + " ");
			}
		}

	}
}
