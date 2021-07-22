package Lec_42_43;

import java.util.Scanner;

public class Rat_in_a_maze {
	static Scanner scan = new Scanner(System.in);
	static boolean ans = false;

	public static void main(String args[]) {
		ans = false;
		int n = scan.nextInt();
		int m = scan.nextInt();
		char board[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = scan.next();
			for (int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		int[][] visited = new int[n][m];
		RatChase(board, 0, 0, visited);
		if (ans == false) {
			System.out.print(-1);
		}
	}

	public static void RatChase(char[][] board, int row, int col, int[][] visited) {
		if (row == board.length - 1 && col == board[0].length) {
			ans = true;
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited[0].length; j++) {
					System.out.print(visited[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}
		if (row == -1 || row == board.length || col == -1 || col == board[0].length || visited[row][col] == 1
				|| board[row][col] == 'X' || ans == true) {
			return;
		}
		visited[row][col] = 1;
//		RatChase(board, row, col - 1, visited); // left
		RatChase(board, row, col + 1, visited); // right
//		RatChase(board, row - 1, col, visited); // up
		RatChase(board, row + 1, col, visited); // down
		visited[row][col] = 0;
	}

}
