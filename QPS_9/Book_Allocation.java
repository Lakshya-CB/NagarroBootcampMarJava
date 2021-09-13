package QPS_9;

import java.util.Scanner;

public class Book_Allocation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T>0) {
			T--;
			int N = scn.nextInt();
			int[] books = new int[N];
			int Students = scn.nextInt();
			int total_pages = 0;
			for(int i=0;i<N;i++) {
				books[i] = scn.nextInt();
				total_pages=total_pages+books[i];
			}
			for(int max_pages = books[N-1];max_pages<=total_pages;max_pages++) {
				if(check( books,max_pages,Students)){
					System.out.println(max_pages);
					break;
				}
			}
		}
	}

	private static boolean check(int[] books, int max_pages, int students) {
		// TODO Auto-generated method stub
		int pages_read = 0;
		int num_student =0;
		for(int i=0;i<books.length;i++) {
			if(pages_read+books[i]<=max_pages) {
				pages_read = pages_read+books[i];
			}
			else {
				num_student++;
				pages_read = books[i];
			}
			if(num_student==students) {
				return false;
			}
		}
		return true;
	}
}
