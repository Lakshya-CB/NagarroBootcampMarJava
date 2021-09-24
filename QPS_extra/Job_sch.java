package QPS_extra;

import java.text.Format;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Job_sch {
	class output_pair {
		final int output1[];
		final int output2[];
		final double output3;
		final double output4;

		private output_pair(int[] o1, int[] o2, double o3, double o4) {
// TODO Auto-generated method stub
			output1 = o1;
			output2 = o2;
			output3 = o3;
			output4 = o4;
		}
	}

	public static void main(String[] args) {
		int input1 = 4;
		int input2 = 2;
		int[] A = { 0, 1, 2, 3 };
		int[] P = { 9, 5, 3, 4 };
		result(input1, input2, A, P);
	}

	static class Process {
		int BT;
		int AT;
		int FT;

		public Process(int at, int bt) {
			// TODO Auto-generated constructor stub
			BT = bt;
			AT = at;
			FT = Integer.MAX_VALUE;
		}

		public String toString() {
			return "AT : " + AT + " , " + " FT : " + FT + "\n";
		}
	}

	public static output_pair result(int input1, int input2, int[] A, int[] P) {
//Code here!!
		Queue<Process> Q = new LinkedList<>();
		Process[] arr = new Process[input1];
		for (int i = 0; i < input1; i++) {
			arr[i] = new Process(A[i], P[i]);
			Q.add(arr[i]);
		}
		int curr_time = 0;
		while (!Q.isEmpty()) {
			Process curr = Q.poll();
			if (curr.BT > input2) {
				curr.BT = curr.BT - input2;
				curr_time = curr_time + input2;
				Q.add(curr);
			} else {
//				Finish process!!
				curr_time = curr_time + curr.BT;
				curr.BT = 0;
				curr.FT = curr_time;
			}
		}

		System.out.println(Arrays.toString(arr));
		double turn_around = 0;

		for (int i = 0; i < input1; i++) {
			turn_around = turn_around + arr[i].FT - arr[i].AT;
//			System.out.println(arr[i].FT + " " + arr[i].AT);
		}
		turn_around = turn_around / A.length;
		System.out.println(String.format("%6f",turn_around));

		double wiating = 0;

		for (int i = 0; i < input1; i++) {
			wiating = wiating + arr[i].FT - arr[i].AT-P[i];
//			System.out.println(arr[i].FT + " " + arr[i].AT);
		}
		wiating = wiating / A.length;
		System.out.println(String.format("%6f",wiating));
		
		return null;
	}
}
