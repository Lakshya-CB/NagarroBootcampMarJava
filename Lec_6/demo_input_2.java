package Lec_6;

import java.util.Scanner;

public class demo_input_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1;i<=n;i++) {
			int x = scn.nextInt();
			System.out.println(i + " : " + x);
		}
	}
}
