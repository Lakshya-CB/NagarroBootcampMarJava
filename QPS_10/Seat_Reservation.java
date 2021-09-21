package QPS_10;

import java.util.Arrays;

public class Seat_Reservation {
	public static void main(String[] args) {
		int[] arr = {13,20,8,3,2};
		book(arr);
	}
	public static void book(int[] arr) {
		int[] Empty_seats = new int[10];
		Arrays.fill(Empty_seats, 20);
		for(int i=0;i<arr.length;i++) {
//			Find which row to fill!!
			int row_num=-1;
			for(int row = 0;row<10;row++) {
				if(Empty_seats[row]>=arr[i]) {
//					Book seats in this row
					row_num=row;
					break;
				}
			}
			if(row_num==-1) {
				System.out.println("No more pls, we are full here!!");
				return;
			}
			
			for(int j =1;j<=arr[i];j++) {
				char row_ch = (char)('J'- row_num);
				System.out.print(row_ch	+""+ (20-Empty_seats[row_num]+j) + " ");
			}
			System.out.println();
			Empty_seats[row_num] = Empty_seats[row_num] -arr[i];
		}
	}
}
