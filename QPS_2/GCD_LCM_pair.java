package QPS_2;

public class GCD_LCM_pair {
	public static void main(String[] args) {
		find(3,6);
	}
	public static void find(int hcf, int lcm) {
		int pro = hcf*lcm;
		for(int a = 1 ; a<=lcm;a++) {
			if(pro%a==0) {
//				b is integral
				int b = pro/a;
				if(hcf(a,b) == hcf) {
					System.out.println(a+" , "+b);
				}
			}
		}
		
	}
	public static int hcf(int a, int b) {
		
		while(b%a!=0) {
			int rem = b%a;
			b = a;
			a = rem;
		}
		return a;
	}
}
