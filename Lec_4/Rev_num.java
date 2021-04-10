package Lec_4;

public class Rev_num {
	public static void main(String[] args) {
		int n = 42341;
		int ans =0;
		while (n!=0) {
			int digit = n%10;
			ans= ans*10+digit;
//			System.out.print(digit + " ");
			n = n/10;
		}
		System.out.println(ans);
	}
}
