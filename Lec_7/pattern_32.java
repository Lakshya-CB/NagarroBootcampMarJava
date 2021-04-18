package Lec_7;

public class pattern_32 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int count = 1;
		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst = cst + 1) {
//				System.out.print("* ");
				if (cst % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(count + " ");
				}
			}
			// Up
			System.out.println();
			if (row < n) {
				count = count + 1;
				nst = nst + 2;
			} else {
				count = count - 1;
				nst = nst - 2;
			}
			row = row + 1;

		}

	}
}
