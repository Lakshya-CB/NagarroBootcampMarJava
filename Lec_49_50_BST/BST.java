package Lec_49_50_BST;

import java.util.Scanner;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST() {
		// TODO Auto-generated constructor stub
//		root = Cons(null, false);

	}

	public BST(int[] in) {
		root = Create(in, 0, in.length-1);
		
	}

	private Node Create(int[] in, int lo, int hi) {
		if(lo>hi) 
			return null;
		int mid = (lo + hi) / 2;
		Node n = new Node();
		n.data = in[mid];
//		System.out.println(lo +" - "+ hi);
		n.left = Create(in, lo, mid - 1);
		n.right = Create(in, mid + 1, hi);

		return n;
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
	public int Min() {
		return Min(root);
	}

	private int Min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		int Min_L = Min(nn.left);
		int Min_R = Min(nn.right);

		return Math.min(nn.data, Math.min(Min_L, Min_R));
	}
	
	public int MaxBST() {
		Node temp = root;
		while (temp.right != null) {
			temp = temp.right;
		}
		return temp.data;
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
		} else if (nn.data > item) {
			return Find(nn.left, item);
		} else {
			return Find(nn.right, item);
		}
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
	public void add(int ele) {
		root = add(root,ele);
	}
	private Node add(Node Curr, int ele) {
//		Code here
		if(Curr==null) {
			Node n = new Node();
			n.data = ele;
			return n;
		}
		
		if(ele<=Curr.data) {
			Curr.left = add(Curr.left,ele);
		}
		else {
			Curr.right =add(Curr.right,ele);	
		}
		return Curr;
	}
	public void remove(int item) {
		root = remove(root, item);
	}
	private Node remove(Node Curr,int  item) {
		
		if(item<Curr.data) {
			Curr.left=remove(Curr.left,item);
		}
		else if(item>Curr.data) {
			Curr.right=remove(Curr.right,item);	
		}
		else {
//			Metro: You have arrived at your destination!!
			
//			Case 1: no children 
			if(Curr.left==null && Curr.right==null) {
				System.out.println("Case1");
				return null;
			}
//			Case 2:1 child
			else if(Curr.left!=null && Curr.right==null) {
				System.out.println("Case2");
				return Curr.left;
			}
			else if(Curr.left==null && Curr.right!=null) {
				System.out.println("Case2");
				return Curr.right;
			}
			else {
//				Replace
//				Option 1: Left Tree - max 
//				Option 2: Right Tree - min
				System.out.println("Case3");
				int Left_max = Max(Curr.left);
				
				Curr.data = Left_max;
				
//				Delete !!
				Curr.left = remove(Curr.left,Left_max);
				
			}
		}
		return Curr;
	}
	public boolean isBst() {
		
		return isBst(root);
	}
	private boolean isBst(Node Curr) {
		if(Curr==null) {
			return true;
		}
		boolean Left_BST = isBst(Curr.left);
		boolean Right_BST = isBst(Curr.right);
		if(Left_BST && Right_BST) {
			int Left_max = Max(Curr.left);
			int Right_min = Min(Curr.right);
//			if(Left_max<=Curr.data &&Right_min>Curr.data) {
//				return true;
//			}
			return Left_max<=Curr.data &&Right_min>Curr.data;
		}
		else {
			return false;
		}
		
	}
}
