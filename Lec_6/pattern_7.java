package Lec_6;

public class pattern_7 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) { // Rows Loop
			// Work on col
			for (int cst = 1; cst <= n; cst = cst + 1) {
				if(cst==1||cst==n||row==1||row==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			// Update || READY!! next print!!
			System.out.println("");
			row = row + 1;
		}

	}
}
