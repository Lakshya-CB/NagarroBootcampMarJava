package Lec_4;

public class Fib_1 {
	public static void main(String[] args) {
		int n = 6;
		int a = 0;
		int b = 1;
		int count = 0;
		while (count < n) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
			count = count + 1;
		}

	}
}
