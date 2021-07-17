package Lec_40;

import Lec_38.Queue;

public class Dynamic_queue extends Queue {
	@Override
	public void EnQueue(int ele) throws Exception {
		if(isFull()) {
			
			int[] new_arr = new int[data.length*2];
//			Content pasta
			
			for(int i=0;i<size;i++) {
				int rear = (front + i)%data.length;
//				System.out.println(data[rear]);
				new_arr[i] = data[rear];

			}
//			Re Assign 
			front =0;
			data=new_arr;
		}
		super.EnQueue(ele);
	}
}
