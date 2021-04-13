package Lec_5;

public class pattern_3 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {
//			Col work
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
//			Update
			System.out.println();
			row = row + 1;
			nst = nst - 1;
//			System.out.println();

		}

	}
}
