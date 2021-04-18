package Lec_7;

public class pattern_19 {
	public static void main(String[] args) {
		int n = 11;
		int row = 1;
		int nst = n / 2 + 1;
		int nsp = -1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");

			}
			int cst = 1;
			if(row==1||row==n) {
				cst=cst+1;
			}
			for (; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
			// Updation
			System.out.println();
			if (row <= n / 2) {
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
