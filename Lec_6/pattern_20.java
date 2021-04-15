package Lec_6;

public class pattern_20 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = n / 2;
		int nst = 1;
		while (row <= n) {
//			print *
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				if (cst == 1 || cst == nst) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if (row <= n / 2) {
				nst = nst + 2;
				nsp = nsp - 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			row = row + 1;
		}
	}
}
