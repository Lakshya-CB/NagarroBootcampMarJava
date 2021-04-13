package Lec_5;

public class pattern_01 {
	public static void main(String[] args) {
		int n =5;
		
		int row = 1;
		while(row<=n) { // Rows Loop
			//Work on col
			for(int cst=1;cst<=n;cst=cst+1) {
				System.out.print("*");
			}
			
			//Update || READY!! next print!!
			System.out.println("");
			row=row+1;
		}
		
	}
}
