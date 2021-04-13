package Lec_5;

import java.util.Scanner;

public class pattern_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = 5;//scn.nextInt();

		int row = 1;
		int nst = 1;
		int naan =0;
		while (row <= n) {
//		Col work ?
			for (int cst = 1; cst <= nst; cst = cst + 1) {
//				naan=naan+1;
				System.out.print("* ");
//				System.out.print(naan+ " ");
			}
//		Update ?
			System.out.println();
			nst = nst + 1;
			row = row + 1;
		}
	}
}
