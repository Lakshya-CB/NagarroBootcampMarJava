package Lec_46;

import java.util.Arrays;

public class Form_Biggest_Number {
	public static void main(String[] args) {
		sulve("DDIDD");
	}
	public static void sulve(String str) {
		int[] ans = new int[str.length()+1];
		int num =1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length()||str.charAt(i)=='I') {
				ans[i]=num;
				num++;
				System.out.println(i+ " : " );
				for(int j=i-1;j>=0 && str.charAt(j)!='I';j--) {
					ans[j]=num;
					num++;
				}

				System.out.println(Arrays.toString(ans));
			}
			
			
		}
	}
}
