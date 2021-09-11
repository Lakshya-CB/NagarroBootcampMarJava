package QPS_8;

import java.util.Scanner;

public class Friends_pair {
	public static void main (String[] args) {
        Scanner Scn = new Scanner(System.in);
        int T = Scn.nextInt();
        while(T>0){
            T--;
            int n = Scn.nextInt();
            System.out.println(rec(n));
            
        }
    }
    public static long rec(int n){
        if(n<=2){
            return n;
        }
        long sp1 = rec(n-1);
        long sp2 = (n-1)*rec(n-2);
        
        return sp1+sp2;
    }
}
