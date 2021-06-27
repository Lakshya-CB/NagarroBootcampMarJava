package Lec_32;

public class _357_CountNumberswithUniqueDigits {
	static int count =0;
	public static void main(String[] args) {
		boolean[] used = new boolean[10];
//		for (int i = 0; i <= 9; i++) {
//			used[i] = true;
//			sulve(i, used, 2);
//			used[i] = false;
//		}
		count =0;
		sulve(0, used, 0);
		System.out.println(count);
	}

	public static void sulve(int curr, boolean[] used, int n) {

		if (curr >= Math.pow(10, n)) {
			return;
		}
//		System.out.println(curr);
		count++;
		int i = 0;
		if(curr ==0) {
			i=1;
		}
		for (; i <= 9; i++) {
			if (used[i] == false) {
				used[i] = true;
				sulve(curr * 10 + i, used, n);
				used[i] = false;
			}

		}
	}
}
