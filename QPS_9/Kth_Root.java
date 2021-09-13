package QPS_9;

public class Kth_Root {
	public static void main(String[] args) {
		int x = 10000-1;
		int k = 4;
//		find (x)^ 1/k
//		System.out.println(Math.pow(x, 1.0/k));
//		int aa = (int) Math.pow(x, 1.0/k);
//		System.out.println(aa);
//		if(Math.pow(x, 1.0/k)-aa>0.9999) {
//			System.out.println("Jadu!!" + (aa+1));
//		}
		int start = 1;
		int end = x;
		int ans = 1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(check(mid,k)<x) {
				ans = mid;
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		System.out.println(ans);
	}
	public static double check(int mid,int k) {
		return Math.pow(mid, k);
	}
}
