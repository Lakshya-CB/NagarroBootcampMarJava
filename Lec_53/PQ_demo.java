package Lec_53;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
//		Min Heap => Rank
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
//		Max Heap => Marks
//		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		
		PQ.add(100);
		PQ.add(20);
		PQ.add(95);
		PQ.add(1000);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
	}
}
