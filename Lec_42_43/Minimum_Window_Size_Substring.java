package Lec_42_43;

public class Minimum_Window_Size_Substring {
	public static void main(String[] args) {
		sulve("AEBANC", "ABC");
	}

	public static void sulve(String Big, String Small) {
//		Smoll Batua banao
		int[] Small_arr = new int[255];
//		Batua Bharo
		for (int i = 0; i < Small.length(); i++) {
			Small_arr[Small.charAt(i)]++; // Batuaaa Number of char at i
		}

		int[] Win_arr = new int[255];
		int start = 0;
		int end = 0;
		int score = 0;// Num of char of Small in Window Sub String
		String win = "";

//		Min storing Variables!!
		int ans_len = Big.length();
		int ans_start = 0;
		int ans_end = 0;

		while (true) {
			System.out.println(win + " : " + score +"{"+start+","+end+"}");
			if (score < Small.length() && end < Big.length()) {
				char end_char = Big.charAt(end);
				if (Win_arr[end_char] < Small_arr[end_char]) {
					score++;
				}
				Win_arr[end_char]++;
				end++;
				win = win + end_char;
			} else if (score == Small.length()) {
				if (end - start < ans_len) {
					ans_len = end - start;
					ans_start = start;
					ans_end = end;
				}

//				System.out.println(win + " : " + score );
//				System.out.println(Big.substring(ans_endstart, end));

				char start_char = Big.charAt(start);
//				Score!!
				if (Win_arr[start_char] == Small_arr[start_char]) {
					score--;
				}

				Win_arr[start_char]--;
				start++;
				win = win.substring(1);
			} else if (end == Big.length()) {
				break;
			}
		}
		System.out.println(Big.substring(ans_start,ans_end));
	}
}
