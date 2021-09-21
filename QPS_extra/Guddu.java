package QPS_extra;

import java.util.Scanner;

public class Guddu {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int Q = scn.nextInt();
		while (Q > 0) {
			int start = scn.nextInt() - 1;
			int end = scn.nextInt() - 1;
			int rot = scn.nextInt() % (end - start + 1);
			// System.out.println(start + " "+end + " "+rot);
			str = str.substring(0, start) + str.substring(end - rot + 1, end + 1) + str.substring(start, end - rot + 1)
					+ str.substring(end + 1);
			Q--;
			// System.out.println(str);

		}

		System.out.println(str);
	}

}
