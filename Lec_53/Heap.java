package Lec_53;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> Al = new ArrayList<Integer>();
	
	public int size() {
		return Al.size();
	}
	
	public boolean isEmpty() {
		return Al.isEmpty();
	}
	public void disp() {
		System.out.println(Al);
	}
	
	public void add(int ele) {
		Al.add(ele);
		int child = Al.size()-1;
		UpHeapify(child);
	}

	private void UpHeapify(int child) {
		// TODO Auto-generated method stub
		int parent = (child-1)/2;
		
		if(Al.get(parent)> Al.get(child) ) {
//			Jado!! swap!!
			swap(child,parent);
			UpHeapify(parent);
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}
	public int peek() {
		return Al.get(0);
	}
	public int poll() {
		return Al.remove(0);
	}
	
}
