package Lec_23;

public class rec_2 {
	public static void main(String[] args) {
//		pat(4);
//		Ruler_maker(3, 3);;
		int[] arr = { 10, 20,5,5,5, 30, 20, 10, 5 };
//		print_arr(arr, 3);
//		print_2(arr,1);
//		System.out.println(max_arr(arr, 0));
		System.out.println(first_Occ(arr, 0, 5));
	}

	public static void Ruler_maker(int L, int T) {

		for (int i = 0; i < L; i++) {
			// write code to print T "-"
			for (int j = 1; j <= T; j++) {
				System.out.print("-");
			}
			System.out.println(i);

			pat(T - 1);
		}
		for (int j = 1; j <= T; j++) {
			System.out.print("-");
		}
		System.out.println(L);
	}

	public static void pat(int n) {
		if (n == 0) {
			return;
		}
		pat(n - 1);
		for (int i = 1; i <= n; i++) {
			System.out.print("-");
		}
		System.out.println();
		pat(n - 1);
	}

	public static void print_arr(int[] arr, int index) { // index to arr.length
		if (index == arr.length) {
//			==0 ?
			return;
		}
		System.out.println(arr[index]);
		print_arr(arr, index + 1);// Sp ? index +1 to arr.length
	}

	public static void print_2(int[] arr, int index) {
		// BC????
		if (index == 0) {
			System.out.println(arr[0]);

			return;
		}
		print_2(arr, index - 1); // SP print from 0 to index-1
		System.out.println(arr[index]);
	}

	public static int max_arr(int[] arr, int index) {
		// BC
		if (index == arr.length) {
			return Integer.MIN_VALUE;
		}
//		if(index==arr.length-1) {
//			return arr[arr.length-1];
//		}

		int sp = max_arr(arr, index + 1);// SP
		int bp = Math.max(arr[index], sp);

		return bp;
//		return Math.max(max_arr(arr, index+1),arr[index]);
	}

	public static int first_Occ(int[] arr, int index, int ele) {
		if(index== arr.length) {
			return -1;
		}
		// Work ? ? 
		if (arr[index] == ele) {
			return index;
		}
		int sp = first_Occ(arr, index + 1, ele);
		return sp;
	}

}
