package QPS_2;

public class Inc_n_digit {
	public static void main(String[] args) {
	rec("", -1, 3);
	}
	public static void rec(String curr, int last_digit, int n) {
		if(n==0) {
			System.out.println(curr);
			return;
		}
		
		for(int i=last_digit+1;i<=9;i++) {
			rec(curr+i, i, n-1);
		}
	}
}
