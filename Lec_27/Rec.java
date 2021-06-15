package Lec_27;

public class Rec {
	static int count = 0;

	public static void main(String[] args) {
//		Queen_perm_wrt_Q(new boolean[3], 0, 3, "");
//		Queen_comb_wrt_Q(new boolean[4], 0, 0, 2, "");
//		System.out.println("-------------");
//		count=0;
//		Queen_comb_wrt_Box(new boolean[4],0,0, 2, "");
		int[] coins = {  2,3,5 };
//		Coin_den_perm_wrt_U(coins, 10, "");
//		System.out.println("-------------");
//
//		Coin_den_comb_wrt_U(coins, 10, 0, "");
		Coin_den_comb_wrt_C(coins, 10, 0, "");
	}

	public static void Queen_perm_wrt_Q(boolean[] board, int curr_Q, int total_Q, String ans) {
		if (total_Q == curr_Q) { // +ve
			System.out.println(++count + " : " + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;// bad phed gayi Queen Q0 .. work for the next queen
				Queen_perm_wrt_Q(board, curr_Q + 1, total_Q, ans + "b" + i + "q" + curr_Q + ",");
				board[i] = false; // Queen uda.. Undo work ??!?!
			}
		}
	}

	public static void Queen_comb_wrt_Q(boolean[] board, int curr_Q, int prev_box, int total_Q, String ans) {
		if (total_Q == curr_Q) { // +ve
			System.out.println(++count + " : " + ans);
			return;
		}
		for (int i = prev_box; i < board.length; i++) {
//			if (board[i] == false) {
//				board[i] = true;// bad phed gayi Queen Q0 .. work for the next queen
			//
			Queen_comb_wrt_Q(board, curr_Q + 1, i + 1, total_Q, ans + "b" + i);
//				board[i] = false; // Queen uda.. Undo work ??!?!
//			}
		}
	}

	public static void Queen_comb_wrt_Box(boolean[] board, int index, int placed_Q, int total_Q, String ans) {
		if (total_Q == placed_Q) { // +ve
			System.out.println(++count + " : " + ans);
			return;
		}

		if (index == board.length) { // -ve
			return;
		}
		Queen_comb_wrt_Box(board, index + 1, placed_Q + 1, total_Q, ans + "b" + index); // Select box
		Queen_comb_wrt_Box(board, index + 1, placed_Q, total_Q, ans); // dont place just go next GG

	}

	public static void Coin_den_perm_wrt_U(int[] coins, int Amount, String ans) {
		if (Amount < 0) {
			return;
		}
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			Coin_den_perm_wrt_U(coins, Amount - coins[i], ans + coins[i]);
		}
	}

	public static void Coin_den_comb_wrt_U(int[] coins, int Amount, int prev_index, String ans) {
		if (Amount < 0) {
			return;
		}
		if (Amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = prev_index; i < coins.length; i++) {
			Coin_den_comb_wrt_U(coins, Amount - coins[i], i, ans + coins[i]);
		}
	}

	public static void Coin_den_comb_wrt_C(int[] coins, int Amount,int index_coin, String ans) {
		
		if(Amount<0 || index_coin==coins.length) {
			return;
		}
		
		if(Amount == 0) {
			System.out.println(ans);
			return;
		}
		
		
		Coin_den_comb_wrt_C(coins, Amount-coins[index_coin], index_coin, ans+coins[index_coin]); // Select
		Coin_den_comb_wrt_C(coins, Amount, index_coin+1, ans); //nahi select
		
	}
}
