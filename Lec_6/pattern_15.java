package Lec_6;

public class pattern_15 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while (row <= 2 * n - 1) {
//			print *
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");	
			}
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			System.out.println();
			if (row < n) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;
		}
	}
}
