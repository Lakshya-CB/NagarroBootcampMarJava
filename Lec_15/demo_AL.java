package Lec_15;

import java.util.ArrayList;

public class demo_AL {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>(30);
		lst.add(10);
		lst.add(20);
		lst.add(30);
		System.out.println(lst);
////		System.out.println(lst.get(0));
//		for(int i=0;i<lst.size();i++) {
//			System.out.println(lst.get(i)+ " ");
//		}
//
//		for(int jsadhflsdh :lst ) {
//			jsadhflsdh = jsadhflsdh+1;
//			System.out.println(jsadhflsdh);
//		}
//		System.out.println(lst);
		lst.set(lst.size()-1, 12);
		System.out.println(lst);
		
	}
}
