package Lec_17;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
//		boolean []a= new boolean[1];
//		System.out.println(a[0]);
		S_SOE(25);
	}

	public static void S_SOE(int n) {
		boolean[] prime = new boolean[n + 1];
		// fill with true, assume everything to be a prime
		Arrays.fill(prime, true);

		// reject 0 and 1- not prime
		prime[0] = false;
		prime[1] = false;

		for (int factor = 2; factor <= (int) Math.sqrt(n); factor++) {
			if (prime[factor]) { // faltu ke non prime numbers ke lp nahi chalane
				for (int mult = 2; mult * factor <= n; mult++) {
					prime[factor * mult] = false; // cutting till n with a table of factor
				}
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]) {
				System.out.print(i+ " ");
			}
		}

	}
}
