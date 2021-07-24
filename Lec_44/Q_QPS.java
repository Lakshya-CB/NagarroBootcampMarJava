package Lec_44;

import java.util.LinkedList;
import java.util.Queue;

import Lec_40.Dynamic_queue;

public class Q_QPS {
	public static void main(String[] args) throws Exception {
//		Dynamic_queue Q = new Dynamic_queue();
//		Q.EnQueue(10);
//		Q.EnQueue(20);
//		Q.EnQueue(30);
//		Q.EnQueue(40);
//		Q.EnQueue(50);
//		Q.disp();
//		Actual_Rev(Q);
//		Q.disp();
//		Actual_Rev(Q);
//		Q.disp();
//		Print_Rev(Q, 0);
		int[] arr = {-20,-10,-50,4,6,-9,-80,60,50};
		First_neg_num_k_win(arr, 3);
	}

	public static void Print_Rev(Dynamic_queue Q, int counter) throws Exception {
		if (counter == Q.size()) {
			return;
		}
		int temp = Q.DeQueue();
		Q.EnQueue(temp);
		Print_Rev(Q, counter + 1);

		System.out.println(temp);

	}

	public static void Actual_Rev(Dynamic_queue Q) throws Exception {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.DeQueue();
		Actual_Rev(Q);
		Q.EnQueue(temp);
	}

	public static void First_neg_num_k_win(int[] arr, int k) {
		Queue<Integer> Win = new LinkedList<>();
//		Make your Window of size k
		int ans = -1;
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Win.add(i);
			}
		}
		if (!Win.isEmpty()) {
			ans = Win.peek();
		}
		System.out.print("[");
		for (int i = 0; i <= k-1; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println(" End ]  ; ans " + arr[ans]);

//		Drag the end of the Window to arrays last index
		for (int idx = k; idx < arr.length; idx++) {
			
//			Update Win
			if (arr[idx] < 0) {
				Win.add(idx);
			}
			if (Win.peek() == idx - k) {
				Win.poll();
			}
//			Answer ?!!
			if (!Win.isEmpty()) {
				ans = Win.peek();
			}
			System.out.print("[");
			for (int i = idx - k + 1; i <= idx; i++) {
				System.out.print(arr[i] + " , ");
			}
			System.out.println(" End ]  ; ans " + arr[ans]);

		}

	}
}
