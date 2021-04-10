package Lec_4;

public class HCF_2 {
	public static void main(String[] args) {
		int n1 = 32;
		int n2 = 64;

		int min = Math.min(n1, n2);

		int divisor = min;
		int hcf = 1;
		while (divisor >= 1) {
//		Repeated work ?
			if (n1 % divisor == 0 && n2 % divisor == 0) {
				System.out.println(divisor);
//				hcf = divisor;
				break;
			}
			divisor = divisor - 1;
		}
//	System.out.println(hcf);

	}
}
