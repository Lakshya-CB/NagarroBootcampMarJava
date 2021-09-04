package QPS_6;

public class trailing_zeros {
    public int trailingZeroes(int n) {
        int x = 5;
        int ans = 0;
        while(x <= n){
            ans =ans+ n / x;
            x = x * 5;
        }

        return ans;
    }
}
