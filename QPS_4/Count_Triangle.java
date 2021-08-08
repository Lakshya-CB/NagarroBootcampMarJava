package QPS_4;

import java.util.Arrays;

public class Count_Triangle {
	public static void main(String[] args) {
		
	}
	public static void all_triangle(int[] arr) {
		Arrays.sort(arr);
//		Number of triangles 
		int num_tri =0;
		for(int c = arr.length-1; c>=2;c--) {
			int a = 0; int b = c-1;
			while (a<b) {
				if(arr[a]+arr[b]>arr[c]) {
//					triangles ?
					num_tri = num_tri + b-a;
					b--;
				}
				else {
//					triangle nahi mila
					a++; //??
//					arr[a]+arr[b]<=arr[c]		
				}
			}
		}
	}
}
