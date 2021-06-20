package Lec_29;

public class Board_Qs {
	public static void main(String[] args) {
		Knight_comb2D_wrt_Box(new boolean[3][3], 0, 0, 0, 3, "");
	}

	public static void Knight_comb2D_wrt_Box(boolean[][] board, int row, int col, int placed_Q, int total_Q,
			String ans) {
		if (total_Q == placed_Q) { // +ve
			System.out.println(ans);
			return;
		}
		if (col == board[row].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) { // -ve
			return;
		}
		if (isSafe_K(board, row, col)) {
			board[row][col] = true;
			Knight_comb2D_wrt_Box(board, row, col + 1, placed_Q + 1, total_Q, ans + "{" + row + "," + col + "}"); // Select
			board[row][col] = false;

		}
		Knight_comb2D_wrt_Box(board, row, col + 1, placed_Q, total_Q, ans); // dont place just go next GG
	}

	public static boolean isSafe_K(boolean[][] board, int row, int col) {

		int[] arr1 = { -1, -2, -2, -1 };
		int[] arr2 = { 2, 1, -1, -2 };
		// on all 4 points
		for (int i = 0; i < 4; i++) {
			int rr = row + arr1[i]; // Curr Row
			int cc = col + arr2[i]; // Curr Col

			if (rr >= 0 && cc >= 0 && cc < board[0].length && board[rr][cc]) {
				return false;
			}
		}
		return true;
	}

}
