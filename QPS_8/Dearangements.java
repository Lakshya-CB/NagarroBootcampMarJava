package QPS_8;

import java.util.Scanner;

public class Dearangements {
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
        if(n==1||n==2){
            return n-1;
        }
        return (n-1)*(rec(n-1)+rec(n-2));
    }

}
