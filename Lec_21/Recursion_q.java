package Lec_21;

public class Recursion_q {
	public static void main(String[] args) {
//		PD(5);
		PI(5);
	}
	public static void PD(int n) {
		// BP PD(5) or PD(n)
		
		// SP PD(4) or PD(n-1)
		
		if(n==0) { // Base Case
			System.out.println("I am done , pls end me");
			return;
		}
		System.out.println(n);// Make Bigger solution
		
		PD(n-1);// Assume this will work!!!!

	}
	public static void PI(int n) {
		if(n==0) { // Base Case hint: Smallest Prob
			return;
		}
		PI(n-1); // Assume this will give Smaller Solution 
		System.out.println(n);
	}
	
}
