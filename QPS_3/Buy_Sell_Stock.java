package QPS_3;

public class Buy_Sell_Stock {
	public static void main(String[] args) {
//		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
//		maxProfit(arr);
		countMaxWindowSize("aabbbbaaaaa", 2);
	}

	public static int maxProfit(int[] prices) {
		int Max_profit = 0;
		int Min_buy = Integer.MAX_VALUE;
		for (int day = 0; day < prices.length; day++) {
//			you are selling your stock on this day
			int Curr_day_profit = prices[day] - Min_buy;
			Max_profit = Math.max(Curr_day_profit, Max_profit);
			System.out.println(Curr_day_profit);
//			Update min buy for the next day!
			Min_buy = Math.min(Min_buy, prices[day]);
		}

		return Max_profit;

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int starting_station = 0;
		int sum = 0;
		int curr_sum = 0;
		for (int i = 0; i < gas.length; i++) {
			sum = sum + gas[i] - cost[i];
			curr_sum = curr_sum + gas[i] - cost[i];
			if (curr_sum < 0) {
				curr_sum = 0;
				starting_station = i + 1;
			}
		}
		if (sum < 0) {
			return -1;
		} else {
			return starting_station;
		}
	}

	public int firstBadVersion(int n) {
		int start = 0;
		int end = n;
		int ans = -1;
		while (start <= end) {
			int mid = end + (start - end) / 2;
			boolean curr = isBadVersion(mid);
			if (curr == false) {
				start = mid + 1;
			} else {
				end = mid - 1;
				ans = mid;
			}

		}
		return ans;
	}

	private boolean isBadVersion(int n) {
		// TODO Auto-generated method stub
		return false;
	}

	static int countMaxWindowSize(String s, int k) {
		int ans = 0;
		int[] win = new int[2];

		int start = 0;
		int end = 0;
		int score = 0;
		while (true) {
//			System.out.println(s.substring(start, end) + " : " + score);
			if(score<=k) {
				ans = Math.max(ans, end-start);
			}
			if (score <= k && end < s.length()) {
//				Increase window size?
				char end_ch = s.charAt(end);
				win[end_ch - 'a']++;
				score = Math.min(win[0], win[1]);

				end++;
			} else if (score > k) {
//				Decrease Size;
				char start_ch = s.charAt(start);
				win[start_ch - 'a']--;
				score = Math.min(win[0], win[1]);

				start++;
			} else {
				break;
			}
		}
		System.out.println(ans);
		return ans;
	}

}
