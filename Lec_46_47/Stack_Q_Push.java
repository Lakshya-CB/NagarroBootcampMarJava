package Lec_46_47;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Q_Push {
	Queue<Integer> Q = new LinkedList<>();

	public void push(int ele) {
		Q.add(ele);
	}

	public int pop() {
		Queue<Integer> Duplicate = new LinkedList<>();

		while (Q.size() > 1) {
			Duplicate.add(Q.poll());
		}

		int temp = Q.poll();
		while (!Duplicate.isEmpty()) {
			Q.add(Duplicate.poll());
		}
		return temp;
	}

}
