package QPS_5;

import java.util.LinkedList;
import java.util.Queue;

public class Create_Tree_order {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int dd) {
			data = dd;
		}
	}

	Node root;

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}

//		Self Work
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + " -> " + nn.data + " <- ";

		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);

//		Smaller Probl
		Disp(nn.left);
		Disp(nn.right);

	}

	public void create_tree_lvl(int[] lvl) {
		Node n = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<>();
		root = n;
		int idx = 1;
		Q.add(n);
		while (!Q.isEmpty()) {
			Node p = Q.poll();
//			Now i have to create its children!! 

//			left child!!

			Node left = new Node(lvl[idx]);
			idx++;
			if (left.data != -1) {
				p.left = left;
				Q.add(left);
			}
//			right child!!

			Node right = new Node(lvl[idx]);
			idx++;
			if (right.data != -1) {
				p.right = right;
				Q.add(right);
			}
		}
	}

	int idx = 0;

	public void create_tree_pre(int[] pre) {
		idx = 0;
		root = create_tree_pre_rec(pre);
	}

	private Node create_tree_pre_rec(int[] pre) {
		if (pre[idx] == -1) {
			idx++;
			return null;
		}
		Node n = new Node(pre[idx]);
		idx++;
		n.left = create_tree_pre_rec(pre);
		n.right = create_tree_pre_rec(pre);

		return n;
	}
}
