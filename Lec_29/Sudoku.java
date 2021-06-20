package Lec_29;

import java.util.Scanner;

public class Sudoku {
	public static void main(String[] args) {
		int[][] board = new int[9][9];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		solve_sudo(board, 0, 0);
	}

	public static void solve_sudo(int[][] board, int row, int col) {

		if (col == board[0].length) {
			col = 0;
			row = row + 1;
		}
		if (row == board.length) {
			// print board
			print_board(board);
			return;
		}

		if (board[row][col] == 0) {
			// 9 calls
			for (int i = 1; i <= 9; i++) {
				// i should be placed ooonly when its safe!
				if (isSafe_sudoku(board, row, col, i)) {
					board[row][col] = i;
					solve_sudo(board, row, col + 1);
					board[row][col] = 0;
				}
			}
		} else {
			solve_sudo(board, row, col + 1);
		}
	}

	public static void print_board(int[][] board) {
		System.out.println("---------------------");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe_sudoku(int[][] board, int row, int col, int ele) {
		// row shuld have unique eles
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == ele) {
				return false;
			}
		}
		// col shuld have unique eles
		for (int i = 0; i < board[0].length; i++) {
			if (board[row][i] == ele) {
				return false;
			}
		}
		//
		int box_r = row / 3;
		int box_c = col / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[box_r * 3 + i][box_c * 3 + j] == ele) {
					return false;
				}
			}
		}

		return true;
	}
}
