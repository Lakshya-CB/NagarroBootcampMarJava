package Lec_24;

public class Rec_ {
	public static void main(String[] args) {
//		SubSeq("abc", "");
//		System.out.println((int) 'a');
//		SubSeqASCII("abc", "");
//		LetterComb("23", "");
		CoinToss(2,"");

	}

	public static void SubSeq(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0); // select a
		String part = str.substring(1);// a divide bc == sp

		SubSeq(part, ans); // Excluded
		SubSeq(part, ans + ch); // Included
	}

	public static void SubSeqASCII(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0); // select a
		String part = str.substring(1);// a divide bc == sp

		SubSeqASCII(part, ans); // Excluded
		SubSeqASCII(part, ans + ch); // Included
		SubSeqASCII(part, ans + (int) ch); // Included ASCII

	}

	public static void LetterComb(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0); // select a
		String part = str.substring(1);// a divide bc == sp
		String mapped = getComb(ch);
		for(int i=0;i<mapped.length();i++) {
			LetterComb(part, ans+mapped.charAt(i));
		}

	}
	public static void CoinToss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		CoinToss(n-1, ans+'H');
		CoinToss(n-1, ans+'T');
	}
	public static String getComb(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {

			return "def";
		} else if (ch == '4') {

			return "ghi";
		} else if (ch == '5') {

			return "jkl";
		} else if (ch == '6') {

			return "mno";
		} else if (ch == '7') {

			return "pqrs";
		} else if (ch == '8') {

			return "tuv";
		} else if (ch == '9') {

			return "wxyz";
		}
		return "";
	}
}
