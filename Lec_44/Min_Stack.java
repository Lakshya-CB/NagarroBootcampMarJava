package Lec_44;

import Lec_40.Dynamic_Stack;

public class Min_Stack {
	private int min;
	private Dynamic_Stack S = new Dynamic_Stack();

	public void push(int item) throws Exception {
		if (S.isEmpty()) {
			S.push(item);
			min = item;
		} else if (item >= min) {
			S.push(item);
		} else {
//			Magic Number?!
			int prev_min = min;
			min = item;
			int Magic = 2 * item - prev_min;
			S.push(Magic);
		}
	}

	public int peek() throws Exception {
//		return S.peek();
		if (S.peek() >= min) {
			return S.peek();
		} else {
//			Magic
			return min;
		}
	}
	public int pop() throws Exception {
		if(S.peek()>=min) {
			return S.pop();
		}
		else {
//			Magic number
			int Magic = S.pop();
			int item = min;
			int prev_min = 2*item - Magic;
			min = prev_min;
			return item;
		}
	}
	public int Min() {
		return min;
	}
}
