package Lec_5;

public class Pattern_11 {
	public static void main(String[] args) {

		int n = 9;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
//		Space
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				if (cst % 2 == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}
	}
}
