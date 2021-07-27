package Lec_45;

public class Linked_List {
	private class Node {
		int data;
		Node next;
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
		}
		else {
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
		while(Curr!=null) {	
			Node After = Curr.next;
			
//			Reverse!! Curr
			Curr.next  =Prev;
//			Update!!
			Prev = Curr;
			Curr = After;
		}
		head = Prev;
	}
}
