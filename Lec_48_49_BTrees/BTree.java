package Lec_48_49_BTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BTree(int[] in,  int[] pre) {
		root = Cons(in, 0, in.length-1, pre, 0, pre.length-1);
	}

	public Node Cons(int[] in, int i_s, int i_e, int[] pre, int p_s, int p_e) {
		if(i_s>i_e||p_s>p_e) {
			return null;
		}
		int root = pre[p_s];
		int found = 0;
		int L_num = 0;
		for (int i = i_s; i <= i_e; i++) {
			if (root == in[i]) {
				found = i;
				break;
			}
			L_num++;
		}
		Node n = new Node();
		n.data = root;

		n.left = Cons(in, i_s, found - 1, pre, p_s + 1, p_s + L_num);
		n.right = Cons(in, found + 1, i_e, pre, p_s + L_num + 1, p_e);
		
		return n;

	}

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

	private void Disp1(Node nn) {
		if (nn == null) {
			return;
		}

		Disp1(nn.left);

//		Self Work
//		String str = "";
//		if (nn.left != null) {
//			str = str + nn.left.data;
//		}
//		str = str + " -> " + nn.data + " <- ";
//
//		if (nn.right != null) {
//			str = str + nn.right.data;
//		}
		System.out.println(nn.data);

		Disp1(nn.right);

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

	public int Diameter1() {
		return Diameter1(root);
	}

	private int Diameter1(Node nn) {
		if (nn == null) {
			return 0;
		}
//		 Go to every Node
//		2T(n/2)
		int LD = Diameter1(nn.left);
		int RD = Diameter1(nn.right);

//		Find your maximum distance between 2 nodes passing through nn
		// O(n) = 2 * T(n/2)

		int L_Ht = Ht(nn.left);
		int R_Ht = Ht(nn.right);

		int Curr_Dia = L_Ht + R_Ht + 2;

		int Child_max_D = Math.max(RD, LD);

		return Math.max(Curr_Dia, Child_max_D);

	}

	public int Diameter2() {
		pairHD ll = Diameter2(root);
		return ll.Dia;
	}

	public pairHD Diameter2(Node nn) {
		if (nn == null) {
			pairHD null_ans = new pairHD();

			null_ans.Dia = 0;
			null_ans.Ht = -1;
			return null_ans;
		}
		pairHD Left = Diameter2(nn.left);
		int LD = Left.Dia;
		int LHt = Left.Ht;

		pairHD Right = Diameter2(nn.right);
		int RD = Right.Dia;
		int RHt = Right.Ht;

//		Diameter Work
		int Curr_Dia = LHt + RHt + 2;
		int Child_max_D = Math.max(RD, LD);
		int Max_Dia = Math.max(Curr_Dia, Child_max_D);

//		Height ka kaam 
		int Curr_Ht = Math.max(LHt, RHt) + 1;

//		Formalities!! 
		pairHD ans = new pairHD();
		ans.Dia = Max_Dia;
		ans.Ht = Curr_Ht;

		return ans;

	}

	private class pairHD {
		int Ht;
		int Dia;
	}

	public boolean isBalanced() {
		isBalanced(root);
		return isBalanced_ans;
	}

	boolean isBalanced_ans = true;

	private void isBalanced(Node nn) {
		if (nn == null) {
			return;
		}
		int LHt = Ht(nn.left);
		int RHt = Ht(nn.right);
		if (LHt - RHt <= 1 && LHt - RHt >= -1) {
//			Node nn is balanced!!
			isBalanced(nn.left);
			isBalanced(nn.right);
		} else {
			isBalanced_ans = false;
		}
	}

	public boolean isBalanced1() {
		return isBalanced1(root);
	}

	private boolean isBalanced1(Node nn) {
		if (nn == null) {
			return true;
		}
		int LHt = Ht(nn.left);
		int RHt = Ht(nn.right);
		if (LHt - RHt <= 1 && LHt - RHt >= -1) {
//			Node nn is balanced!!
			boolean Left_bal = isBalanced1(nn.left);
			boolean Right_bal = isBalanced1(nn.right);
			return Left_bal && Right_bal;
		} else {
			return false;
		}
	}

	public boolean isBalanced2() {
		return isBalanced2(root).isBal;
	}

	private pairHB isBalanced2(Node nn) {
		if (nn == null) {
			pairHB null_ans = new pairHB();
			return null_ans;
		}

		pairHB Left = isBalanced2(nn.left);
		int LHt = Left.Ht;
		boolean LisBal = Left.isBal;

		pairHB Right = isBalanced2(nn.right);
		int RHt = Right.Ht;
		boolean RisBal = Right.isBal;

		pairHB ans = new pairHB();
//		Is Bal Tree for Node nn ?!
		if (LHt - RHt <= 1 && LHt - RHt >= -1) {
//			Node nn is balanced!!
			ans.isBal = LisBal && RisBal;
		} else {
			ans.isBal = false;
		}
//		Ht!?
		ans.Ht = Math.max(LHt, RHt) + 1;
		return ans;
	}

	private class pairHB {
		int Ht = -1;
		boolean isBal = true;
	}

	public boolean flipEquiv(Node root1, Node root2) {

		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null || root2 == null || root1.data != root2.data) {
			return false;
		}

//		if(root1.data!=root2.data) {
//			return false;
//		}

//		Case 1: No flip
		boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);

//		Case 2: Flip happened
		boolean flip = flipEquiv(root1.right, root2.left) && flipEquiv(root1.left, root2.right);

		return noflip || flip;
	}
	public void lvl_Trav() {
		Queue<Node> Q = new LinkedList<>(); 
		Q.add(root);
		while(!Q.isEmpty()) {
			Node Curr = Q.poll();
			if(Curr==null) {
				continue;
			}
			
//			Self Work
			System.out.print(Curr.data+ " ");
//			Add children
			
			Q.add(Curr.left);
			Q.add(Curr.right);
		}
	}
	public void lvl_Trav2() {
		Queue<Node> Curr_lvl = new LinkedList<>();
		Queue<Node> Next_lvl = new LinkedList<>();
		
		Curr_lvl.add(root);
		while(!Curr_lvl.isEmpty()) {
			Node Curr = Curr_lvl.poll();
			if(Curr==null) {
				continue;
			}
			
//			Self Work
			System.out.print(Curr.data+ " ");
//			Add children
			
			Next_lvl.add(Curr.left);
			Next_lvl.add(Curr.right);
			
			if(Curr_lvl.isEmpty()) {
				Curr_lvl = Next_lvl;
				Next_lvl = new LinkedList<Node>();
				System.out.println();
			}
		}
	}
}
