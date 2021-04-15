package Lec_6;

public class Pattern_21 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 3;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}
			int cst = 1;
			if(row==n) {
				nst=nst-1;
			}
			for (; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;
			row = row + 1;
		}
	}
}
