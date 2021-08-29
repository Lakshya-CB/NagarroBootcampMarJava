package Lec_DP;

public class Wine_proble {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
//		System.out.println(theeka(wine, 0, wine.length-1, 1));
//		System.out.println(theeka(wine, 0, wine.length-1));
//		int[][] dp = new int[wine.length][wine.length];
//		System.out.println(theeka_TD(wine, 0, wine.length - 1, dp));
		System.out.println(BU(wine));
	}

	public static int theeka(int[] wine, int s, int e, int Day) {
		if (s == e) {
			return wine[s] * Day;
		}
		int sp1 = wine[s] * Day + theeka(wine, s + 1, e, Day + 1);
		int sp2 = wine[e] * Day + theeka(wine, s, e - 1, Day + 1);

		return Math.max(sp1, sp2);
	}

	public static int theeka(int[] wine, int s, int e) {
		int Day = wine.length - e + s;
		if (s == e) {
			return wine[s] * Day;
		}
		int sp1 = wine[s] * Day + theeka(wine, s + 1, e);
		int sp2 = wine[e] * Day + theeka(wine, s, e - 1);

		return Math.max(sp1, sp2);
	}

	public static int theeka_TD(int[] wine, int s, int e, int[][] dp) {
		int Day = wine.length - e + s;
		if (s == e) {
			return wine[s] * Day;
		}
		if (dp[s][e] != 0) {
			return dp[s][e];
		}
		int sp1 = wine[s] * Day + theeka_TD(wine, s + 1, e, dp);
		int sp2 = wine[e] * Day + theeka_TD(wine, s, e - 1, dp);
		dp[s][e] = Math.max(sp1, sp2);

		return Math.max(sp1, sp2);
	}

	public static int BU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		for (int s = wine.length - 1; s >= 0; s--) {
			for (int e = 0; e < wine.length; e++) {
				if (e < s) {
					dp[s][e] = 0;
				} else {
					int Day = wine.length - e + s;
					int sp1 = wine[s] * Day;
					if (s + 1 < wine.length) {
						sp1 = sp1 + dp[s + 1][e];
					}
					int sp2 = wine[e] * Day;
					if (e - 1 >= 0) {
						sp2 = sp2 + dp[s][e - 1];
					}
					dp[s][e] = Math.max(sp1, sp2);
				}
			}
		}

		return dp[0][wine.length - 1];
	}
}
