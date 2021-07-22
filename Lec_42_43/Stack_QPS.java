package Lec_42_43;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
//		int[][] relation = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
//		Celeb(relation);
//		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 65, 60, 15, 8 };
//		Nxt_Gr8(arr);
//		Nxt_Gr8_order(arr);
//		Nxt_Gr8_M3(arr);
		int[] Stonk= {80,50,70,30,20,40,90,10,5,35} ;
		Stock_Span(Stonk);
	}

	public static void Celeb(int[][] Rel) {
		Stack<Integer> Potential = new Stack<>();
		for (int i = 0; i < Rel.length; i++) {
			Potential.push(i);
		}

		while (Potential.size() > 1) {
			int A = Potential.pop();
			int B = Potential.pop();
			if (Rel[A][B] == 1) {
				Potential.push(B);
			} else {
				Potential.push(A);
			}
		}

		int Celeb = Potential.pop();
		for (int jj = 0; jj < Rel.length; jj++) {
//			Check row
			if (Rel[Celeb][jj] == 1) {
				System.out.println("Lies!! No Celeb !! ");
				return;
			}
//			Check col of Celeb
			if (jj != Celeb && Rel[jj][Celeb] == 0) {
				System.out.println("Lies!! No Celeb !! ");
				return;
			}
		}
		System.out.println(Celeb + " is a real person!! ");
	}

	public static void Nxt_Gr8(int[] arr) {
		Stack<Integer> Ans_Memory = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!Ans_Memory.isEmpty() && arr[i] >= Ans_Memory.peek()) {
				int ans = Ans_Memory.pop();
				System.out.println(ans + " - > " + arr[i]);
			}
			Ans_Memory.push(arr[i]);
		}
		while (!Ans_Memory.isEmpty()) {
			int ans = Ans_Memory.pop();
			System.out.println(ans + " - > " + -1);
		}
	}

	public static void Nxt_Gr8_order(int[] arr) {
		Stack<Integer> Ans_Memory = new Stack<Integer>();
		int[] ans_order = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!Ans_Memory.isEmpty() && arr[i] >= arr[Ans_Memory.peek()]) {
				int idx = Ans_Memory.pop();
				ans_order[idx] = arr[i];
				System.out.println("[" + idx + "]" + " - > " + arr[i]);
				System.out.println(Arrays.toString(ans_order));

			}
			Ans_Memory.push(i);
		}

		while (!Ans_Memory.isEmpty()) {
			int idx = Ans_Memory.pop();
			ans_order[idx] = -1;
			System.out.println("[" + idx + "]" + " - > " + -1);
		}
		System.out.println("------------");
//		System.out.println(Arrays.toString(ans_order));

	}

	public static void Nxt_Gr8_M3(int[] arr) {
		Stack<Integer> Potential_nxt = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {

			while (!Potential_nxt.isEmpty() && arr[i] >= Potential_nxt.peek()) {
				Potential_nxt.pop();
			}
			if (Potential_nxt.isEmpty()) {
				System.out.println(arr[i] + " -> " + -1);
			} else {
				System.out.println(arr[i] + " -> " + Potential_nxt.peek());
			}

			Potential_nxt.push(arr[i]);
		}

	}

	public static void Stock_Span(int[] Stonk) {
		Stack<Integer> P_S_start = new Stack<>();
		int[] ans = new int[Stonk.length];
		for (int i = 0; i < Stonk.length; i++) {
			int Curr_day = i;
			while (!P_S_start.isEmpty() && Stonk[Curr_day] >= Stonk[P_S_start.peek()]) {
				P_S_start.pop();
			}
			if (P_S_start.isEmpty()) {
				ans[Curr_day] = Curr_day;
			} else {
				ans[Curr_day] = Curr_day - P_S_start.peek() - 1;
			}
			P_S_start.push(Curr_day);
		}
		System.out.println(Arrays.toString(ans));
	}
}
