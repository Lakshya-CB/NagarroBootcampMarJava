package Lec_42;

public class Vivek_loves {
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0,0};
		game(arr, 0, arr.length - 1, 0, "");
		System.out.println(max_score);
	}
	static int max_score =0;
	public static long sum(int[] arr, int s, int e) {
		long sum_ans = 0;
		for (int i = s; i <= e; i++) {
			sum_ans = sum_ans + arr[i];
		}
		return sum_ans;
	}

	public static void disp(int[] arr, int s, int e,int chop) {

		for (int i = s; i <= e; i++) {
			if (i == chop) {
				System.out.print("|| ");
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	public static void game(int[] arr, int start, int end, int score, String ans) {
//		System.out.println(" ; " + score);
		max_score = Math.max(max_score, score);
		for (int chop = start + 1; chop <= end; chop++) {
			long left_sum = sum(arr, start, chop - 1);
			long right_sum = sum(arr, chop, end);
			if (left_sum == right_sum) {
//				disp(arr,start, end, chop);
//				System.out.println(score+1);
//				Select left array
				game(arr, start, chop - 1, score + 1, ans + chop + " ");
//				Select Right array
				game(arr, chop, end, score + 1, ans + chop + " ");
			}
		}
	}
}
