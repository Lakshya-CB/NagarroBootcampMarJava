package Lec_4;

public class HCF_3 {
	public static void main(String[] args) {
		int n1 = 32;
		int n2 = 60;

		int divisor = Math.min(n1, n2);
		int dividend =Math.max(n2, n1);
		while(true) {
			int remainder =  dividend %divisor;
			if(remainder==0) {
				break;
			}
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);
		
	}
}
