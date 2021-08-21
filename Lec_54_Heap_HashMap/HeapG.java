package Lec_54_Heap_HashMap;

import java.util.ArrayList;

public class HeapG<T extends Comparable<T>> {
	ArrayList<T> Al = new ArrayList<T>();

	public int size() {
		return Al.size();
	}

	public boolean isEmpty() {
		return Al.isEmpty();
	}

	public void disp() {
		System.out.println(Al);
	}

	public void add(T ele) {
		Al.add(ele);
		int child = Al.size() - 1;
		UpHeapify(child);
	}

	private void UpHeapify(int child) {
		// TODO Auto-generated method stub
		int parent = (child - 1) / 2;

//		if (Al.get(parent) > Al.get(child)) {
// 		Comparing Ranks
		if(Al.get(parent).compareTo(Al.get(child))>0) {
//			Jado!! swap!!
			swap(child, parent);
			UpHeapify(parent);
		}
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		T temp = Al.get(i);
		Al.set(i, Al.get(j));
		Al.set(j, temp);
	}

	public T peek() {
		return Al.get(0);
	}

	public T poll() {
		T temp = Al.get(0);
//		Sweap 0th with last element Al.get(Al.size()-1)

		Al.set(0, Al.get(Al.size() - 1));
		Al.remove(Al.size() - 1);

		DownHeapify(0);

		return temp;
	}

	private void DownHeapify(int parent) {
		// TODO Auto-generated method stub
		int c1 = parent * 2 + 1;
		int c2 = parent * 2 + 2;

		int min_idx = parent;
// 		Comparing Ranks
//		if (c1 < Al.size() && Al.get(min_idx) > Al.get(c1)) {

		if (c1 < Al.size() && Al.get(min_idx).compareTo(Al.get(c1)) > 0) {
			min_idx = c1;
		}
// 		Comparing Ranks
//		if (c2 < Al.size() && Al.get(min_idx) > Al.get(c2)) {
		
		if (c2 < Al.size() && Al.get(min_idx).compareTo(Al.get(c2)) > 0) {
			min_idx = c2;
		}

		if (min_idx != parent) {
			swap(min_idx, parent);
			DownHeapify(min_idx);
		}

	}

}
