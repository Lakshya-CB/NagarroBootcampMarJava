package Lec_15;

import java.util.ArrayList;

public class sum_2_arr {
	public static void main(String[] args) {
		int[] one = {9,8,7,5};
		int[] two = {9,6,7};
		System.out.println(sum(one, two));
	}
	public static ArrayList<Integer> sum(int[] one,int[] two){
		ArrayList<Integer> ans = new ArrayList<>();
//		logic
		int p1= one.length-1;
		int p2= two.length-1;
		int carry = 0;
		while(p1>=0||p2>=0) {
			int sum=carry;
			if(p1>=0) {
				sum=sum+one[p1];
			}
			if(p2>=0) {
				sum=sum+two[p2];
			}
			ans.add(0,sum%10);// adding digit at left
			carry = sum/10;
			p1--;
			p2--;
		}
		if(carry>0) {
			ans.add(0,carry);
		}
		return ans;
	}
}
