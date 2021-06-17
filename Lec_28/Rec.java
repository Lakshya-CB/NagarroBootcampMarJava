package Lec_28;

public class Rec {
	public static void main(String[] args) {
//		int[] coins = { 2, 2, 2,3, 4, 4 };
//		Coin2_den_comb_wrt_U(coins, 6, -1, "");
////		Coin2_den_comb_wrt_C(coins, 6, 0, "");
//		System.out.println("--------");
//		Coin3_den_comb_wrt_U(coins, 6, 0, "");
//		System.out.println("--------");
//		Coin3_den_comb_wrt_C(coins, 6, 0, "",true);
//		
		Queen_comb2D_wrt_Box(new boolean[4][3], 0, 0, 0, 3, "");

	}

	// coins are finite
	public static void Coin2_den_comb_wrt_U(int[] coins, int Amount, int prev_index, String ans) {
		if (Amount < 0) {
			return;
		}
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = prev_index + 1; i < coins.length; i++) {
			Coin2_den_comb_wrt_U(coins, Amount - coins[i], i, ans + coins[i]);
		}
	}

	public static void Coin2_den_comb_wrt_C(int[] coins, int Amount, int index_coin, String ans) {

		if (Amount < 0 || index_coin == coins.length) {
			return;
		}

		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
		Coin2_den_comb_wrt_C(coins, Amount - coins[index_coin], index_coin + 1, ans + coins[index_coin]); // Select
		Coin2_den_comb_wrt_C(coins, Amount, index_coin + 1, ans); // nahi select
	}

	// Finite, Unique Solution
	public static void Coin3_den_comb_wrt_U(int[] coins, int Amount, int prev_index, String ans) {
		if (Amount < 0) {
			return;
		}
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
//		System.out.println(ans);
		for (int i = prev_index; i < coins.length; i++) {
			if (i > prev_index && coins[i] == coins[i - 1]) {
				continue;
			}
			Coin3_den_comb_wrt_U(coins, Amount - coins[i], i + 1, ans + coins[i]);
		}
	}

	public static void Coin3_den_comb_wrt_C(int[] coins, int Amount, int index_coin, String ans, boolean flag) {

		if (Amount < 0 || index_coin == coins.length) {
			return;
		}

		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
//		if(prev coin is not selected and its the same as current coin ) {
//			Unselect my current coin; 
//		}
		if (flag == false && coins[index_coin] == coins[index_coin - 1]) {
			Coin3_den_comb_wrt_C(coins, Amount, index_coin + 1, ans, false); // nahi select
			return;
		}
		Coin3_den_comb_wrt_C(coins, Amount - coins[index_coin], index_coin + 1, ans + coins[index_coin], true); // Select
		Coin3_den_comb_wrt_C(coins, Amount, index_coin + 1, ans, false); // nahi select
	}

	public static void Queen_comb2D_wrt_Box(boolean[][] board, int row, int col, int placed_Q, int total_Q,
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
		if (isSafe(board, row, col)) {
			board[row][col] = true;
			Queen_comb2D_wrt_Box(board, row, col + 1, placed_Q + 1, total_Q, ans + "{" + row + "," + col + "}"); // Select																							// box
			board[row][col] = false;
		}

		Queen_comb2D_wrt_Box(board, row, col + 1, placed_Q, total_Q, ans); // dont place just go next GG
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		// Check above

		for (int i = 0; i < row; i++) {
			if (board[i][col]) {
				return false;
			}
		}

		// check left
		for (int j = 0; j < col; j++) {
			if (board[row][j]) {
				return false;
			}
		}
		// Upper left Diagonal
		int r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// Upper right Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}
