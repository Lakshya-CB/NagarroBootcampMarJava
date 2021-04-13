package Lec_5;

import java.util.Scanner;

public class pattern_5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int row = 1;
		int nsp = 0;
		int nst = n;
		while (row <= n) {
//			Loop on space
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print("* ");
			}
//			Update? 
			System.out.println();
			nsp = nsp + 1;
			nst = nst - 1;
			row = row + 1;

		}

	}
}
