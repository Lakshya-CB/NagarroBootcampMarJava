package Lec_46;

import java.util.Stack;

public class Linked_List {
	private class Node {
		int data;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int data) {
			this.data = data;
			// TODO Auto-generated constructor stub
		}
	}

	Node head;

	public void Disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
//			Jump
			temp = temp.next;
		}
		System.out.println("");
		System.out.println("---------------------------");
	}

	public int Size() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			// Jump
			temp = temp.next;
		}
		return size;
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		Node temp = head;
		while (temp.next != null) {
			// Jump
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			// Jump
			temp = temp.next;
		}
		return temp.data;
	}

	public void addFirst(int ele) {
		Node nn = new Node();
		nn.data = ele;
//		Connect?!!
		nn.next = head;
//		Update Head
		head = nn;
	}

	public void addLast(int ele) {
//		Go to Last Node
		if (head == null) {
			Node nn = new Node();
			nn.data = ele;

			head = nn;
		} else {

			Node temp = head;
			while (temp.next != null) {
				// Jump
				temp = temp.next;
			}

			Node nn = new Node();
			nn.data = ele;
			temp.next = nn;
		}
	}

	public void addAt(int idx, int ele) {
		if (idx == 0) {
			addFirst(ele);
		} else if (idx == Size()) {
			addLast(ele);
		} else {
			Node prev = head;
			for (int i = 1; i <= idx - 1; i++) {
				prev = prev.next;
			}

//			Create new Node
			Node after = prev.next;
			Node nn = new Node();
			nn.data = ele;
//			Connect nn to prev and after!!
			prev.next = nn;
			nn.next = after;
		}
	}

	public Node getNodeAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			// Jump
			temp = temp.next;
		}
		return temp;
	}

	public boolean isEmpty() {
//		return Size()==0; O(n) Compelte LInked LList pe traverse
		return head == null;
	}

	public int removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is Empty!");
		} else {
			int data = head.data;
			head = head.next;

			return data;
		}
	}

	public int removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is Empty!");
		}

		if (Size() == 1) {
			int data = head.data;
			head = null;
			return data;
		} else {
			Node temp = getNodeAt(Size() - 2);
			Node last = temp.next;
			int data = last.data;

			temp.next = null;
			return data;
		}
	}

	public int removeAt(int idx) throws Exception {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == Size() - 1) {
			return removeLast();
		} else {
			Node temp1 = getNodeAt(idx - 1);
			Node temp2 = temp1.next; // idx
			Node temp3 = temp2.next; // idx+1

			temp1.next = temp3;
			return temp2.data;
		}
	}

	public void Reverse() {
		Node Prev = null;
		Node Curr = head;
		while (Curr != null) {
			Node After = Curr.next;

//			Reverse!! Curr
			Curr.next = Prev;
//			Update!!
			Prev = Curr;
			Curr = After;
		}
		head = Prev;
	}

	public void Rev_rec1() {
//		Rev_rec1(null, head);
		Node temp = head;
		Rev_rec1(head);
		temp.next = null;
	}

	private void Rev_rec1(Node Prev, Node Curr) {
		if (Curr == null) {
//			Head update
			head = Prev;
			return;
		}

		Rev_rec1(Curr, Curr.next);

		Curr.next = Prev;
	}

	private void Rev_rec1(Node Prev) {
		Node Curr = Prev.next;
		if (Curr == null) {
//			Head update
//			head.next =null;
			head = Prev;

			return;
		}
//		System.out.println("Hi " + Prev.data + " : " + Prev.next.data);
		Rev_rec1(Curr);
//		System.out.println("Bye " + Prev.data);
		Prev.next.next = Prev;
	}

	public int Mid_point() {
		Node slow = head;
		Node fast = head;
		while (fast.next.next != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int Kth_last(int k) {
		Node fast = head;
		Node slow = head;
//		Move fast by k step
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow.data;
	}

	public Node Inter_2_LL(Node head1, Node head2) {
		// https://leetcode.com/problems/intersection-of-two-linked-lists/
		Node car1 = head1;
		Node car2 = head2;
		while (car1 != car2) {
			if (car1 == null) {
				car1 = head2;
			} else {
				car1 = car1.next;
			}
			if (car2 == null) {
				car2 = head1;
			} else {
				car2 = car2.next;
			}
		}
		return car1;
	}

	public void make_2_LL_test_Inter() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;

		Node n11 = new Node(11);
		Node n12 = new Node(12);
		n11.next = n12;
//		n12.next = n8;

		Disp(n11);
		Disp(n1);

		System.out.println(Inter_2_LL(n11, n1));
	}

	private void Disp(Node temp) {

		while (temp != null) {
			System.out.print(temp.data + " ");
//			Jump
			temp = temp.next;
		}
		System.out.println("");
		System.out.println("---------------------------");
	}

	public void k_rev(int k) {
		head = k_rev(head, k);
	}

	private Node k_rev(Node nn, int k) {
		if (nn == null) {
			return null;
		}
		Node next_prob = nn;
		for (int i = 1; i <= k && next_prob != null; i++) {
			next_prob = next_prob.next;
		}

		Node Head_next_P = k_rev(next_prob, k);// 4k then 7k;

		Node Prev = Head_next_P;
		Node Curr = nn;
		for (int i = 0; i < k && Curr != null; i++) {
			Node After = Curr.next;

			Curr.next = Prev;
//			Update var!!

			Prev = Curr;
			Curr = After;

		}
		return Prev;

	}
	
	
	public void k_rev1(int k) {
		Stack<Node> SS = new Stack<>();
		Node orignal = head;
		
		Node new_head = null;
		Node new_tail= null;
		while(orignal!=null) {
//			Simply put K nodes or <K node in stack
			while(SS.size()<k&&orignal!=null) {
				SS.push(orignal);
				orignal = orignal.next;
			}
			
//			Pop node  and join them at the end of the new Linked List
			while(!SS.isEmpty()) {
				Node toAdd = SS.pop();
				if(new_head==null) {
					new_head = toAdd;
					new_tail = toAdd;
				}
				else {
					new_tail.next = toAdd;
					new_tail = toAdd; 
				}
			}
		}
		head = new_head;
		new_tail.next=null;
	}
	

}
