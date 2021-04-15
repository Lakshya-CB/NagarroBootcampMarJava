package Lec_6;

import java.util.Scanner;

public class Patern_24 {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int a = scn.nextInt();
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int count = 0;

		while (row <= n) {
//			Space
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print(" \t");
			}
			count = 1;
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print(count + "\t");
				if (cst < row) {
					count = count + 1;
				} else {
					count = count - 1;
				}
			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}
	}
}
