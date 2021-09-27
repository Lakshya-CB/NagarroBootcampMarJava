package Test_Discuss;

import java.util.Scanner;

public class Nagarro_String_Q {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		String D = scn.next();
		String E = scn.next();
		String F = scn.next();
		rec(A, D, E, F);
		System.out.println(ans);
	}

	static int ans = Integer.MAX_VALUE;

	public static void rec(String A, String D, String E, String F) {
		ans = Math.min(ans, A.length());
		if (A.indexOf(D) != -1) {
			int t = A.indexOf(D);
			String temp = A.substring(0, t) + A.substring(t + D.length());
			System.out.println(A + " " + temp + " " + D);
			rec(temp, D, E, F);
		}
		if (A.indexOf(E) != -1) {
			int t = A.indexOf(E);
			String temp = A.substring(0, t) + A.substring(t + E.length());
			System.out.println(A + " " + temp + " " + E);
			rec(temp, D, E, F);
		}
		if (A.indexOf(F) != -1) {
			int t = A.indexOf(F);
			String temp = A.substring(0, t) + A.substring(t + F.length());
			System.out.println(A + " " + temp + " " + F);
			rec(temp, D, E, F);
		}

	}
}
