package Lec_33;

import java.util.Arrays;
import java.util.Scanner;

public class Doubts {
	public static void main(String[] args) {

//		System.out.println(num_Unique("abcda"));
//		Scanner scn = new Scanner(System.in);
//		int TT = scn .nextInt();
//		while(TT-->0) {
//			String str = scn.next();
//			int K = scn.nextInt();
//			System.out.println(K_uniqueSS1(str, K));
//			
//			
//		}

		Scanner scn = new Scanner(System.in);
		int TT = scn.nextInt();
		while(TT-->0) {
			String str = scn.next();
			ongest_even(str);
			
		}
//		TOH(TT, 1, 2, 3);
	}

	public static void sort(String[] arr) {
		// loop
		// Sorting algo like selections sort!

		String A = arr[0];
		String B = arr[1];
		if (compare(A, B) > 0) {
//		 		temp=B;
			// Swap!!
		}
	}

	public static int compare(String A, String B) { // A-B

		if (A.equals(B)) {
			return 0;
		}
		if (A.startsWith(B)) {
			// A < B or A ayega UPAR
			return -1;
		}
		if (B.startsWith(A)) {
			// a>B || B ayega UPAR
			return 1;
		}

		// Simply Compare char wise !!!
		// Write urself!!

		return 1;
	}

	public static int num_Unique(String str) {
		int[] batua = new int[26]; // 2 byte char!!
		int unique = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// ch ka single run liya
			if (batua[ch - 'a'] == 0) {
				unique++;
			}
			batua[ch - 'a']++;
		}
//		System.out.println(Arrays.toString(batua));
		return unique;
	}

	public static int K_uniqueSS3(String str, int k) {
		int ans = -1;
		int[] batua = new int[26]; // 2 byte char!!
		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j < str.length(); j++) {
				// Adding j char in your sub String
				String temp_ss = str.substring(i, j + 1); // n kaam?!

				int un = num_Unique(temp_ss); // n kaam?! FIRSE!!!
				System.out.println(temp_ss + " : " + temp_ss.length() + " , " + un);

				if (un == k) {
					ans = Math.max(ans, temp_ss.length());
//					System.out.println(temp_ss + " : " + temp_ss.length() + " , "+ans);
				}
			}

			break;

		}
		System.out.println(ans);
		return ans;
	}

	public static int K_uniqueSS2(String str, int k) {
		int ans = -1;

		for (int i = 0; i < str.length(); i++) {
			int[] batua = new int[26]; // 2 byte char!!
			int unique = 0;
			for (int j = i; j < str.length(); j++) {
				// Adding j char in your sub String
				String temp_ss = str.substring(i, j + 1); // n kaam?!

				char ch = str.charAt(j);
				if (batua[ch - 'a'] == 0) {
					unique++;
				}
				batua[ch - 'a']++;

				System.out.println(temp_ss + " : " + (j - i + 1) + " , " + unique);

				if (unique == k) {
					ans = Math.max(ans, j - i + 1);
//					System.out.println(temp_ss + " : " +  (j-i+1) + " , "+ans);
				}
			}
//			break;
		}
		System.out.println(ans);
		return ans;
	}

	public static int K_uniqueSS1(String str, int k) {
		int ans = -1;
		int[] batua = new int[26]; // 2 byte char!!
		int unique = 0;
		int start = 0;
		int end = 0;
		String ss = "";
		while (end < str.length() && start <= end) {
			// Adding j char in your sub String

			if (unique <= k) {
				char ch = str.charAt(end);
				if (batua[ch - 'a'] == 0) {
					unique++;
				}
				batua[ch - 'a']++;
				ss = ss + ch;
				end++;
			} else {
				char ch = str.charAt(start);
				batua[ch - 'a']--;
				if (batua[ch - 'a'] == 0) {
					unique--;
				}
				start++;
				ss = ss.substring(1);
			}

			if (unique == k) {
				ans = Math.max(ans, end - start);
			}

			System.out.println(ss + "," + (end - start) + " : " + unique);
		}
		return ans;
	}

	public static void TOH(int num, int src, int dest, int help) {

		if (num == 0) {
			return;
		}
		// S.P ? move above Num-1 disk to helper tower!!
		TOH(num - 1, src, help, dest);

		// Move NUm Disk to Helper
		System.out.println("Move " + num + "th disc from T" + src + " to T" + dest);

		// Put it bro back!!
		TOH(num - 1, help, dest, src);

	}

	public static void ongest_even(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j < str.length(); j++) {
				// Adding j char in your sub String
				if ((j - i + 1) % 2 != 0) {
					continue;
				}
//				String temp_ss = str.substring(i, j + 1); // n kaam?!

				int len = (j - i + 1);
				int k = len / 2;
				int lefty_sum = 0;
				int righty_sum = 0;

				for (int left = 0; left < k; left++) {
//					System.out.print(str.charAt(i+left)+ " ");
					lefty_sum = lefty_sum + (str.charAt(i + left) - '0');
				}
//				System.out.println();

				for (int right = 0; right < k; right++) {
//					System.out.print(str.charAt(i+k+right)+ " ");
					righty_sum = righty_sum + (str.charAt(i + k + right) - '0');
				}
//				System.out.println();

//				System.out.println("-------------" +lefty_sum+ " : " + righty_sum);
				if (lefty_sum == righty_sum) {
					ans = Math.max(ans, len);
				}
			}
		}
		System.out.println(ans);
	}
}
