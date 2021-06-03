package Lec_21;

public class Rev_String {
	public static void main(String[] args) {
//		String str = "The sky is blue";
//		rev_str("The sky is blue");
		long start = System.currentTimeMillis();
		conc();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	public static void rev_str(String str) {
		while (true) {
			// find index of ' '
			int index = str.lastIndexOf(' ');
			String word = str.substring(index + 1);
			// extract word from index+1 to end
			System.out.println(word);
			if (index == -1) {
				break;
			}

			str = str.substring(0, index);
//			System.out.println(str);
		}

	}
	
	public static void conc() {
		int n = 100000;
		String str = "";
		for(int i=1;i<=n;i++) {
			str = str+i;
		}
	}
}
