package Test_Discuss;

public class Sub_string {
	public static void main(String[] args) {
		String str = "baaabbcca";
		int K = 2;
//		for(int L = 1;L<=str.length();L++) {
//			System.out.println(check(str, L, K) + " "+L);
//		}
		int start = 1;
		int end = str.length();
		int ans = 1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(check(str, mid, K)) {
				ans=mid;
				start= mid+1;
			}
			else {
				end = mid-1;
			}
		}
		System.out.println(ans);
	}
	public static boolean check(String str, int win,int K) {
		int[] batua = new int[26];
		int score = 0;
		for(int i=0;i<win;i++) {
			if(batua[str.charAt(i) - 'a']==0) {
				score++;				
			}
			batua[str.charAt(i) - 'a']++;
			if(score>K) {
				return false;
			}
		}
		
		for(int i=win;i<str.length();i++) {
			int end = str.charAt(i);
			if(batua[end - 'a']==0) {
				score++;				
			}
			batua[end - 'a']++;
			
			int start = str.charAt(i-win);
			if(batua[start - 'a']==1) {
				score--;				
			}
			batua[start - 'a']--;
			if(score>K) {
				return false;
			}
		}
		return true;
	}
}
