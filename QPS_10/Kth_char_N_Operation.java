package QPS_10;

public class Kth_char_N_Operation {
	public static void main(String[] args) {
		System.out.println(rev(comp("ABABABABA")));
	}
	public static String comp(String str) {
		char[] ch_arr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch_arr[i]=='A') {
				ch_arr[i]='B';
			}
			else {
				ch_arr[i]='A';w
			}
		}
		return new String(ch_arr);
	}
	public static String rev(String str) {
		int left =0;
		int right = str.length()-1;
		char[] ch_arr = str.toCharArray();
		while(left<right) {
//			swap left right
			char temp = ch_arr[left];
			ch_arr[left] = ch_arr[right];
			ch_arr[right] = temp;
			left++;
			right--;
		}
		return new String(ch_arr);
	}
}
