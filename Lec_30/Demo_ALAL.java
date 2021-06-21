package Lec_30;

import java.util.ArrayList;

public class Demo_ALAL {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> Big = new ArrayList<>();
//		Big.add(80);
		ArrayList<Integer> Al = new ArrayList<>();
		Al.add(10);
		Al.add(20);
		Big.add(Al);
//		System.out.println(Big);
		
		ArrayList<Integer> Al_1 = new ArrayList<>(Al);
//		for(int val : Al) {
//			Al_1.add(val);
//		}
		Al_1.add(30);
		Big.add(Al_1);
		System.out.println(Big);
		
		
		ArrayList<Integer> Al_2 = new ArrayList<>(Al_1);
		Al_2.add(40);
		Big.add(Al_2);
		System.out.println(Big);
		
		
	}
	
}
