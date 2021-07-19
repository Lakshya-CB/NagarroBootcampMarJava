package QPS_2;

public class Happy_number {
	public static void main(String[] args) {
		System.out.println(rec(17));
	}

	public static boolean rec(int n) {
		if(n==1||n==7) {
			return true;
		}
		if(n<10) {
			return false;
		}
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit * digit;
		}
		return rec(sum);
	}
}
