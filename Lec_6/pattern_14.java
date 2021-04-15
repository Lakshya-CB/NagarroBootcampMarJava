package Lec_6;

public class pattern_14 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
//			print *
			for(int cst = 1;cst<=nst;cst=cst+1) {
				System.out.print("* ");
			}
			System.out.println();
			if(row<n) {
				nst=nst+1;
			}
			else {
				nst=nst-1;
			}
			row=row+1;
		}
	}
}
