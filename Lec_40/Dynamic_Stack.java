package Lec_40;

import Lec_37.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int ele) throws Exception {
		if(isFull()) {
			int[] new_arr = new int[2*data.length]; 
			// Content Copy
			for(int i=0;i<=tos;i++) {
				new_arr[i] = data[i];
			}
			data = new_arr;
		}
		super.push(ele);
	}
}
