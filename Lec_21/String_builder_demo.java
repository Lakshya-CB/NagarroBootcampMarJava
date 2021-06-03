package Lec_21;

import java.util.Scanner;

public class String_builder_demo {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
		String str = "hello";
		
		StringBuilder sb = new StringBuilder(str);
		// print
		System.out.println(sb);
		
		// get char
		System.out.println(sb.charAt(1));
		
		// SubString
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1,sb.length()));
		
		/////// 

		// append
		sb.append("-dasf"); // O(1)
		System.out.println(sb);
		
		//insert
		sb.insert(0, "yo-");	//O(N)
		System.out.println(sb);
		
		// set
		sb.setCharAt(2, '='); // O(1)
		System.out.println(sb);
		
		// del
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		sb.delete(0, sb.length()-1);
		System.out.println(sb);
		String aa = sb.toString();
		
//		long start = System.currentTimeMillis();
//		
//		int n = 100000;
//		StringBuilder sb2  =new StringBuilder("");
//		System.out.println(sb2.length());
//		str = "";
//		for(int i=1;i<=n;i++) {
//			sb2.append(i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
//		
	}
}
