package Lec_Hashmap_Imple;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		public Node(K key2, V val2) {
			// TODO Auto-generated constructor stub
			key = key2;
			val = val2;
		}

		K key;
		V val;
		Node next;

		public String toString() {
			return " key " + key + " , val " + val;
		}
	}

	int size = 0;
	ArrayList<Node> bucket_arr = new ArrayList<>();

	public HashMap(int i) {
		for (int j = 0; j < i; j++) {
			bucket_arr.add(null);
		}
	}

	public HashMap() {
		this(4);
	}

	public void put(K key, V val) {

		int bi = hashingfn(key);
		Node head = bucket_arr.get(bi);
//		Key exist in LL!!
//		Just update value;
		Node temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}

//		When key is not in the LL !!Add at first!!
		Node n = new Node(key, val);
		n.next = head;
		bucket_arr.set(bi, n);
		size++;
//		check the load factor!! = avg elements in side your bucket!!!
		double load_factor = (1.0 * size) / bucket_arr.size();
		if (load_factor > 2) {
//			rehashing!!!
			System.out.println("rehashing!!!");
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> old_bucket_arr = bucket_arr;
		ArrayList<Node> new_bucket_arr = new ArrayList<>();
//		adding twice buckets!!
		for (int i = 0; i < old_bucket_arr.size() * 2; i++) {
			new_bucket_arr.add(null);
		}
//		How to copy?!!??!
		size = 0;
		bucket_arr = new_bucket_arr;
//		Get each pair!!
		for(Node head : old_bucket_arr) {
			Node temp = head;
			while(temp!=null) {
//				each pair is temp!!
				put(temp.key,temp.val);
				temp= temp.next;
			}		
		}
	}

	private int hashingfn(K key) {
		// TODO Auto-generated method stub
		int hash = key.hashCode();
		return hash % bucket_arr.size();
	}

	public V get(K key) {
		int bi = hashingfn(key);
		Node head = bucket_arr.get(bi);
//		Key exist in LL!!
//		Just update value;
		Node temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {

		int bi = hashingfn(key);
		Node head = bucket_arr.get(bi);
//		Key exist in LL!!
//		Just update value;

//		Case 1 : to rempve node is head!!
		if (head.key.equals(key)) {
			size--;
			bucket_arr.set(bi, head.next);
		}

//		Case 2 : somewhere in the middle!!
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {
				prev.next = temp.next;
				size--;
				return temp.val;
			}
			prev = temp;
			temp = temp.next;
		}

		return null;
	}

	public void disp() {
		for (Node head : bucket_arr) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp + " || ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
