package Test_Discuss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Busy_man {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
		int[][] D2 = new int[n][2];
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> E = new ArrayList<Integer>();
			E.add(scn.nextInt());
			E.add(scn.nextInt());
			D2[i][0] = E.get(0);
			D2[i][1] = E.get(1);

			AL.add(E);
		}

		Collections.sort(AL, new lol());

		Arrays.sort(D2, new lol2());
//		System.out.println(AL);
//		for (int[] rr : D2) {
//			System.out.println(Arrays.toString(rr));
//		}
		int work = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {
			if (D2[i][0] >= end) {
				work++;
				end = D2[i][1];
				System.out.println(Arrays.toString(D2[i]));
			}
		}
		System.out.println(work);
	}

	static class lol implements Comparator<ArrayList<Integer>> {

		@Override
		public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
			// TODO Auto-generated method stub
			return o1.get(1) - o2.get(1);
		}

	}

	static class lol2 implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return o1[1] - o2[1];
		}

	}
}
