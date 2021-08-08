package Lec_48;

import java.util.Scanner;

public class BTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BTree() {
		// TODO Auto-generated constructor stub
		root = Cons(null, false);
	}

	Scanner scn = new Scanner(System.in);

	private Node Cons(Node parent, boolean is_left) {
		if (parent == null) {
			System.out.println("Root node ka data ?");
		} else if (is_left) {
			System.out.println(parent.data + " ke Left Childs ka data ?");
		} else {

			System.out.println(parent.data + " ke Right Childs ka data ?");
		}

		Node nn = new Node();
		nn.data = scn.nextInt();

		System.out.println(nn.data + " Has left child ?");
		boolean has_left = scn.nextBoolean();
		if (has_left) {
			nn.left = Cons(nn, true);
		}

		System.out.println(nn.data + " Has right child ?");
		boolean has_right = scn.nextBoolean();
		if (has_right) {
			nn.right = Cons(nn, false);
		}

		return nn;
	}

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

	public int Size() {
		return Size(this.root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}

		int Left_ST = Size(nn.left);

		int Right_ST = Size(nn.right);

		return Left_ST + Right_ST + 1;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int Max_L = Max(nn.left);
		int Max_R = Max(nn.right);

		return Math.max(nn.data, Math.max(Max_L, Max_R));
	}

	public boolean Find(int ele) {
		return Find(root, ele);

	}

	private boolean Find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.data == item) {
			return true;
		}

		boolean present_LST = Find(nn.left, item);
		boolean present_RST = Find(nn.right, item);

		return present_LST || present_RST;

	}

	public int Ht() {
		return Ht(root);
	}

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}

		int Ht_LST = Ht(nn.left); // L1
		int Ht_RST = Ht(nn.right); // L1

		return Math.max(Ht_LST, Ht_RST) + 1; // L0
	}

	public int Leaf() {
		return Leaf(root);
	}

	private int Leaf(Node nn) {
		if (nn == null) {
			return 0;
		}
//		Leaf Node ans = 1 
		if (nn.left == null && nn.right == null) {
			return 1;
		}
		int LST = Leaf(nn.left);
		int RST = Leaf(nn.right);

		return LST + RST;
	}

	public int Diameter() {
		Diameter(root);
		return max_Dia;
	}

	int max_Dia = -1;

	public void Diameter(Node nn) {
		if (nn == null) {
			return;
		}
//		 Go to every Node
//		2T(n/2)
		Diameter(nn.left);
		Diameter(nn.right);

//		Find your maximum distance between 2 nodes passing through nn

		// O(n) = 2 * T(n/2)
		int L_Ht = Ht(nn.left);
		int R_Ht = Ht(nn.right);

		int Curr_Dia = L_Ht + R_Ht + 2;
		max_Dia = Math.max(max_Dia, Curr_Dia);
		System.out.println(nn.data + " : " + Curr_Dia);
	}
}
