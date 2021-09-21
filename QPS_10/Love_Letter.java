package QPS_10;

public class Love_Letter {
	public static void main(String[] args) {
		String str = "Hello dFrien";
		int K = 5;

//		Extract words!!
		while (!str.isEmpty()) {
			String word = "";
			if (str.indexOf(' ') != -1) {
				word = str.substring(0, str.indexOf(' '));
				str = str.substring(str.indexOf(' ') + 1);
			} else {
				word = str;
				str = "";
			}
			if (word.length() >= 1) {
				System.out.println(word + "---" + isSame(word,K));
			}
//			System.out.println(word+"---");
		}
	}

	public static boolean isSame(String word, int k) {
		k = k%word.length();
		String part1 = word.substring(word.length()-k);
		String part2 = word.substring(0,word.length()-k);
		String new_word = part1+part2;
		return word.equals(new_word);
	}
}
