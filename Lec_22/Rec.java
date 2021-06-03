package Lec_22;

public class Rec {
	public static void main(String[] args) {
//		PDI(4);
//		PID(1,5);
//		convert(5);
//		System.out.println(fact(4));
		// System.out.println(pow(2, 3));
		try2(1, 3);
	}

	public static void convert(int n) {
		PID(1, n);

	}

	public static void PDI(int n) { // BP
		if (n == 0) {
			return;
		}
		System.out.println("Hi" + n); // working
		// SP
		PDI(n - 1);
		System.out.println("Bye" + n); // working
	}

	public static void PID(int start, int n) {
		if (start > n) {
			return;
		}
		System.out.println(start); // Work

		PID(start + 1, n); // SP

		System.out.println(start);// Work
	}

	public static int fact(int n) {
		if (n == 1) { // Base Case
			return 1;
		}
//		int Sp = fact(n - 1); // SP
//		int BS = Sp * n; // Work
//		return BS;
		return fact(n - 1) * n;
	}

	public static int pow(int a, int x) {
		if (x == 0) {
			return 1;
		}
		int sp = pow(a, x - 1);
		int bp = sp * a;
		return bp;
//		return a* pow(a, x - 1) ;
	}

	public static int fib(int n) {
		if (n < 2) {
			return n;
		}
		int sp1 = fib(n - 1);
		int sp2 = fib(n - 2);
		return sp1 + sp2;
//		return  fib(n-1) + fib(n-2);
	}

		public static void try2(int start, int n) {
			if (n == 0) {
				return;
			}
			System.out.println("Hi"+start);
			try2(start + 1, n - 1);
			System.out.println("By"+start);
	
		}

}
