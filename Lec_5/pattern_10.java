package Lec_5;

public class pattern_10 {
public static void main(String[] args) {
	int n = 3;
	int nst = 2*n-1;
	int nsp= 0;
	int row=1;
	while(row<=n) {
		for(int csp=1;csp<=nsp;csp++) {
			System.out.print("  ");
		}
		for(int cst=1;cst<=nst;cst=cst+1) {
			System.out.print("* ");
		}
		nsp=nsp+1;
		nst= nst-2;
		row=row+1;
		System.out.println();
		
	}
}
}
